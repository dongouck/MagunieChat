<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<script>
	$(function(){
		$(".child-menu").click(function(){
			alert("aaa");
		})
		
	});
	
</script>

<div class="menu-wrapper">

        <header class="vertical-header">
            <div class="vertical-header-wrapper">
                <nav class="nav-menu">
                    <div class="logo">
                        <a href="main.do"><img src="img/logo.png" alt=""></a>
                    </div><!-- end logo -->
                    
					<div class="margin-block"></div>
					
					<div class="menu-search">
                        <form method="get" id="" action="loginAction.do">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="ID">
                                <input type="text" class="form-control" placeholder="PASSWORD">
                                <input type="submit" value="log in"></button>
                            </div>
                        </form>
                    </div><!-- end menu-search -->
					
                    <div class="margin-block"></div>

                    <ul class="primary-menu">
                        <li class="child-menu"><a href="#">Main <i class="fa fa-angle-right"></i></a>
                        </li>
                        <li class="child-menu"><a href="bbs.do">Shared Links <i class="fa fa-angle-right"></i></a>
                        </li>
                        <li class="child-menu"><a href="#">Black History <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="#">Menu Example 01 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                                <li><a href="#">Menu Example 04</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="#">Menu Example 02 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                                <li><a href="#">Menu Example 04</a></li>
                                                <li><a href="#">Menu Example 05</a></li>
                                                <li><a href="#">Menu Example 06</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="#">Menu Example 03 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                                <li><a href="#">Menu Example 04</a></li>
                                                <li><a href="#">Menu Example 05</a></li>
                                                <li><a href="#">Menu Example 06</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="#">Menu Example 04 <i class="fa fa-angle-right"></i></a> 
                                        <div class="subsub-menu-wrapper">  
                                            <ul class="subsub-menu center-content">
                                                <li><a href="#">Menu Example 01</a></li>
                                                <li><a href="#">Menu Example 02</a></li>
                                                <li><a href="#">Menu Example 03</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Contact <i class="fa fa-angle-right"></i></a>
                        </li>
                    </ul>
                    
                    <div class="margin-block"></div>


                    <div class="margin-block"></div>

                    <div class="menu-social">
                        <ul class="list-inline text-center">
                            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                        </ul>
                    </div><!-- end menu -->
                </nav><!-- end nav-menu -->
            </div><!-- end vertical-header-wrapper -->
        </header><!-- end header -->
    </div><!-- end menu-wrapper -->