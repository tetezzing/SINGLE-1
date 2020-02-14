<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SNS 회원가입</title>

<!-- START :: CSS -->
<link href="/SINGLE/resources/css/master.css" rel="stylesheet" type="text/css">
<!-- END :: CSS -->

<!-- START :: JAVASCRIPT -->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>

<script type="text/javascript">

	$(function() {
		// join.jsp에서 넘긴 정보 가져오기
		var snsType = $(opener.document).find("#snshiddenForm input[name='snsType']").val();
		var SNS_ID = $(opener.document).find("#snshiddenForm input[name='SNS_ID']").val();
		var SNS_NICKNAME = $(opener.document).find("#snshiddenForm input[name='SNS_NICKNAME']").val();
		var SNS_EMAIL = $(opener.document).find("#snshiddenForm input[name='SNS_EMAIL']").val();
		var access_token = $(opener.document).find("#snshiddenForm input[name='access_token']").val();
		var MEMBER_VERIFY = $(opener.document).find("#snshiddenForm input[name='MEMBER_VERIFY']").val();
		
		$("#SUBMIT").attr("disabled", "disabled");
		$("#email_auth").attr("disabled", "disabled");

		// 이메일을 받았다면 받은 이메일로 입력되도록!
		if(SNS_EMAIL != null && SNS_EMAIL != "") {
			
			$("#MEMBER_EMAIL").val(SNS_EMAIL);
			$("#email_auth").attr("style", "display: none");
		
		} else { // 제공 동의 안했으면 이메일 체크 들어가기
			
			// 이메일 정규식
			var regExp = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;	
			
			// 이메일 체크
			$("#MEMBER_EMAIL").keyup(function() {
				
				if($("#MEMBER_EMAIL").val() != null && $("#MEMBER_EMAIL").val() != ""){
					
					// 이메일 형식인지 체크
					if(regExp.test($("#MEMBER_EMAIL").val())) {
						
						// 이메일 중복 체크
						$.ajax({
							type: "POST",
							url: "/SINGLE/member/emailCheck.do",
							data: { MEMBER_EMAIL : $("#MEMBER_EMAIL").val() },
							dataType: "JSON",
							success: function(msg) {
								
								if(msg.result > 0) {
									$("#email_check").text("이미 사용중인 이메일입니다.");
									$("#email_check").attr("style", "color:red");
									
								} else {
									$("#email_auth").removeAttr("disabled");
									
									$("#email_check").text("사용 가능한 이메일입니다. 이메일 인증을 진행해주세요.");
									$("#email_check").attr("style", "color:blue");
								}
							},
							error: function() {
								alert("이메일 중복체크 통신 실패");
							}
						});
						
					} else {
						$("#email_check").text("이메일 형식이 아닙니다.");
						$("#email_check").attr("style", "color:red");
					}
					
				} else {
					$("#email_check").text("필수 정보입니다.");
					$("#email_check").attr("style", "color:red");
				}
			});
			
			$("#email_auth").click(function() {
				
				$("#email_check").text("이메일 인증 진행중...");
				$("#email_check").attr("style", "color:green");
				
				// 이메일 인증
				$.ajax({
					type: "POST",
					url: "/SINGLE/member/emailAuth.do",
					data: { MEMBER_EMAIL : $("#MEMBER_EMAIL").val() },
					dataType: "JSON",
					success: function(msg) {
						alert("입력하신 이메일로 인증번호가 전송되었습니다.")
						//alert("authNum : " + msg.authNum);
						$("#emailAuthHiddenForm input[name='authNum']").val(msg.authNum);
						
						var url = "/SINGLE/views/member/joinemailauth.jsp";
	            		var title = "";
	            		var prop = "top=200px,left=600px,width=500px,height=500px";
	            		window.open(url, title, prop);
					},
					error: function() {
						alert("이메일 인증 통신 실패");
					}
				});
			});
		}
		
		// 닉네임 체크
		$("#MEMBER_NICKNAME").keyup(function() {
			
			if($("#MEMBER_NICKNAME").val() != null && $("#MEMBER_NICKNAME").val() != "") {
				// 닉네임 중복 체크
				$.ajax({
					type: "POST",
					url: "/SINGLE/member/nickCheck.do",
					data: { MEMBER_NICKNAME : $("#MEMBER_NICKNAME").val() },
					dataType: "JSON",
					success: function(msg) {
						if(msg.result == 1) {
							$("#nick_check").text("이미 사용중인 닉네임입니다.");
							$("#nick_check").attr("style", "color:red");
							
							$("#SUBMIT").attr("disabled", "disabled");
							
						} else {
							$("#nick_check").text("사용 가능한 닉네임입니다.");
							$("#nick_check").attr("style", "color:blue");
							
							$("#SUBMIT").removeAttr("disabled");
						}
					},
					error: function() {
						alert("닉네임 중복 체크 통신 실패");
					}
				});
			} else {
				$("#nick_check").text("필수 정보입니다.");
				$("#nick_check").attr("style", "color:red");
			}
		});
		
		$("#snsjoinForm").submit(function(e) {
			e.preventDefault();
			
			var MEMBER_EMAIL = $(this).find("#MEMBER_EMAIL").val();
			var MEMBER_NAME = $(this).find("#MEMBER_NAME").val();
			var MEMBER_NICKNAME = $(this).find("#MEMBER_NICKNAME").val();
			var MEMBER_GENDER = $(this).find("input:radio[name='MEMBER_GENDER']:checked").val();
			
			$(opener.document).find("#snsjoinhiddenForm input[name='snsType']").val(snsType);
			$(opener.document).find("#snsjoinhiddenForm input[name='MEMBER_VERIFY']").val(MEMBER_VERIFY);
			$(opener.document).find("#snsjoinhiddenForm input[name='MEMBER_EMAIL']").val(MEMBER_EMAIL);
			$(opener.document).find("#snsjoinhiddenForm input[name='MEMBER_NAME']").val(MEMBER_NAME);
			$(opener.document).find("#snsjoinhiddenForm input[name='MEMBER_NICKNAME']").val(MEMBER_NICKNAME);
			$(opener.document).find("#snsjoinhiddenForm input[name='MEMBER_GENDER']").val(MEMBER_GENDER);
			$(opener.document).find("#snsjoinhiddenForm input[name='SNS_ID']").val(SNS_ID);
			$(opener.document).find("#snsjoinhiddenForm input[name='SNS_NICKNAME']").val(SNS_NICKNAME);
			$(opener.document).find("#snsjoinhiddenForm input[name='access_token']").val(access_token);
			
			$(opener.document).find("#snsjoinhiddenForm").submit();
			
			close();
		});
	});

</script>

<!-- END :: JAVASCRIPT -->

</head>
<body>

	<div>
		<!-- 사용자에게 입력받는 form -->
		<form id="snsjoinForm" method="post" action="/SINGLE/member/snsjoin.do">
			<div>
				<input type="hidden" id="MEMBER_VERIFY" name="MEMBER_VERIFY">
			</div>
		
			<div>
				<label for="MEMBER_EMAIL">이메일</label>
			</div>
			<div>
			    <input type="text" id="MEMBER_EMAIL" name="MEMBER_EMAIL" placeholder="example@example.com" autocomplete="off" required="required" />
			</div>
			<div class="check_font" id="email_check"></div><!-- 경고문이 들어갈 공간 -->

			<div>
				<label for="MEMBER_NAME">이름</label>
			</div>
			<div>
				<input type="text" id="MEMBER_NAME" name="MEMBER_NAME" placeholder="이름" autocomplete="off" required="required" />
			</div>
			
			<div>
				<label for="MEMBER_NICKNAME">닉네임</label>
			</div>
			<div>
				<input type="text" id="MEMBER_NICKNAME" name="MEMBER_NICKNAME" placeholder="별명" autocomplete="off" required="required" />
			</div>
			<div class="check_font" id="nick_check"></div><!-- 경고문이 들어갈 공간 -->
			
			<div>
				<label for="MEMBER_GENDER">성별</label>
			</div>
			<div>
				<div>
					<input type="radio" name="MEMBER_GENDER" value="M" required="required">
					<label for="MEMBER_GENDER">남자</label>
				</div>
				<div>
					<input type="radio" name="MEMBER_GENDER" value="F" required="required">
					<label for="MEMBER_GENDER">여자</label>
				</div>
			</div>

			<input type="submit" id="SUBMIT" value="가입">
		</form>		
	</div>

</body>
</html>