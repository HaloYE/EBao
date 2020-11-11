function validate() {
    var number = document.getElementById("userID");
    var password = document.getElementById("password");
    if (number.value === "") {
        alert("账号不能为空！");
        number.focus();
        return false;
    }
    if (password.value === "") {
        alert("密码不能为空！");
        password.focus();
        return false;
    }
    return true;
}
