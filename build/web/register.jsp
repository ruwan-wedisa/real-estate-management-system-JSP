<%@include file="header.jsp" %>

<!-- banner -->
<div class="inside-banner">
    <div class="container"> 
        <span class="pull-right"><a href="#">Home</a> / Register</span>
        <h2>Register</h2>
    </div>
</div>
<!-- banner -->


<div class="container">
    <div class="spacer">
        <div class="row register">
            <div class="col-lg-6 col-lg-offset-3 col-sm-6 col-sm-offset-3 col-xs-12 ">

                <form name="form1" action="registerCodeJsp.jsp" method="POST">

                    <input type="text" class="form-control"  name="form_name"
                           data-validation="length alphanumeric" 
                           data-validation-length="max30"
                           data-validation-error-msg="Maximum length of characters is 30"       
                           placeholder="Name"
                           >

                    <input type="text" class="form-control"  name="form_NIC"
                           data-validation="length" data-validation-length="10-10"
                           data-validation-error-msg="length of NIC number is 10" 
                           placeholder="NIC number"
                           >

                    <input type="text" class="form-control" placeholder="Enter Email" name="form_email"
                           data-validation="email"
                           >

                    <input type="text" class="form-control" placeholder="telephone number" name="form_tel"
                           data-validation="length" data-validation-length="9-10" 
                           data-validation-error-msg="Telephone Number has to be an Number(9-10 numbers)"
                           >

                    <input type="text" class="form-control" placeholder="User Name" name="form_Username"
                           data-validation="required"
                           >
                    <input type="password" class="form-control" placeholder="Password" name="form_pw"
                           data-validation="length alphanumeric" 
                           data-validation-length="8-16"
                           >


                    <textarea rows="6" class="form-control" placeholder="Address" name="form_address"
                              data-validation="length alphanumeric" 
                              data-validation-length="max50"
                              data-validation-error-msg="Maximum length of characters for Address is 50"
                              ></textarea>


                    <button type="submit" class="btn btn-success" name="Submit">Register</button>


                </form>

            </div>

        </div>
    </div>
</div>

<script src="assets/jquery.form-validator.min.js"></script>
<script>
    $.validate({
        lang: 'en'
    });
</script>

<%@include file="footer.jsp" %>