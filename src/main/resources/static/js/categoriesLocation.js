$(function(){
    /*        if(supportsGeoLocation()){
                alert("你的浏览器支持 GeoLocation.");
            }else{
                alert("不支持 GeoLocation.")
            }
            // 检测浏览器是否支持HTML5
            function supportsGeoLocation(){
                return !!navigator.geolocation;
            }*/
    // 单次位置请求执行的函数
    function getLocation(){
        navigator.geolocation.getCurrentPosition(mapIt,locationError);
    }
    //定位成功时，执行的函数
    function mapIt(position){
        var lon = position.coords.longitude;
        var lat = position.coords.latitude;
        // alert("您位置的经度是："+lon+" 纬度是："+lat);
        var map = new BMap.Map("allmap");
        var point = new BMap.Point(""+lon+"",""+lat+"");
        var gc = new BMap.Geocoder();
        translateCallback = function (point){
            gc.getLocation(point, function(rs){
                var addComp = rs.addressComponents;
                if(addComp.province!==addComp.city){
                    document.getElementById("nowlocation").innerHTML = addComp.province + ", " + addComp.city + ", " + addComp.district ;
                    // document.getElementById("nowlocation").innerHTML = "当前位置："+addComp.province + ", " + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber;
                }
                else{
                    document.getElementById("nowlocation").innerHTML = addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber;
                    // document.getElementById("nowlocation").innerHTML = "当前位置：" + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber;
                }

            });
        }
        BMap.Convertor.translate(point,0,translateCallback);
    }
    // 定位失败时，执行的函数
    function locationError(error)
    {
        switch(error.code)
        {
            case error.PERMISSION_DENIED:
                alert("User denied the request for Geolocation.");
                break;
            case error.POSITION_UNAVAILABLE:
                alert("Location information is unavailable.");
                break;
            case error.TIMEOUT:
                alert("The request to get user location timed out.");
                break;
            case error.UNKNOWN_ERROR:
                alert("An unknown error occurred.");
                break;
        }
    }
    // 页面加载时执行getLocation函数
    window.onload = getLocation();
})
