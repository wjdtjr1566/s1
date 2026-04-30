<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html; charset=utf-8;");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자야구 게임</title>
<style>
    /* 전체 배경 및 폰트 */
    body {
        background-color: #f0f2f5;
        font-family: 'Malgun Gothic', sans-serif;
        text-align: center;
        padding: 40px;
    }

    /* 게임판 메인 박스 */
    .game-board {
        background-color: white;
        max-width: 500px;
        margin: 0 auto;
        padding: 30px;
        border-radius: 20px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.1);
    }

    /* 타이틀 */
    h1 {
        color: #2c3e50;
        font-size: 28px;
        margin-bottom: 30px;
        text-shadow: 1px 1px 2px rgba(0,0,0,0.1);
    }

    /* 셀렉트 박스들을 가로로 예쁘게 정렬 */
    .select-group {
        display: flex;
        justify-content: center;
        gap: 15px;
        margin-bottom: 30px;
    }

    /* 개별 숫자 박스 묶음 */
    .number-box h3 {
        font-size: 14px;
        margin-bottom: 10px;
    }
    
    /* 셀렉트 박스 디자인 (자물쇠 다이얼 느낌) */
    select {
        width: 80px;
        height: 80px;
        font-size: 32px;
        font-weight: bold;
        text-align: center;
        border: 3px solid #bdc3c7;
        border-radius: 15px;
        background-color: #fff;
        cursor: pointer;
        appearance: none; /* 기본 화살표 숨기기 */
        transition: 0.3s;
    }
    select:focus {
        border-color: #e74c3c;
        outline: none;
        box-shadow: 0 0 10px rgba(231, 76, 60, 0.3);
    }

    /* 버튼 스타일 */
    .btn {
        background-color: #e74c3c;
        color: white;
        border: none;
        padding: 15px 40px;
        font-size: 20px;
        font-weight: bold;
        border-radius: 50px;
        cursor: pointer;
        transition: all 0.2s;
        box-shadow: 0 5px 15px rgba(231, 76, 60, 0.4);
    }
    .btn:hover {
        background-color: #c0392b;
        transform: translateY(-2px);
    }
    .btn:active {
        transform: translateY(2px);
    }

    /* 현황판 (전광판 느낌) */
    .scoreboard {
        margin-top: 40px;
        background-color: #2c3e50;
        color: #ecf0f1;
        padding: 20px;
        border-radius: 15px;
        text-align: left;
        min-height: 150px;
        box-shadow: inset 0 5px 10px rgba(0,0,0,0.5);
    }
    .scoreboard-title {
        display: block;
        font-size: 18px;
        font-weight: bold;
        color: #f1c40f;
        border-bottom: 2px dashed #7f8c8d;
        padding-bottom: 10px;
        margin-bottom: 15px;
        text-align: center;
    }
    
    /* 기록 리스트 */
    #log {
        list-style-type: none;
        padding: 0;
        margin: 0;
        font-family: 'Courier New', monospace; /* 타자기/전광판 폰트 */
        font-size: 18px;
        letter-spacing: 1px;
    }
    #log li {
        margin-bottom: 10px;
        padding: 8px;
        background-color: rgba(255,255,255,0.05);
        border-radius: 5px;
    }
</style>
</head>
<body>

<div class="game-board">
    <h2 id="win" style="display:none; color:#f1c40f; text-shadow: 0 0 10px #f1c40f;">🎊 홈런입니다! 축하드려요! 🎊</h2>
    <h1>⚾ 숫자 야구 [AJAX 버전]</h1>

    <div class="select-group">
        <div class="number-box">
            <h3 style="color:#3498db">첫 번째</h3>
            <select class="one">
                <option value="1">1</option><option value="2">2</option><option value="3">3</option>
                <option value="4">4</option><option value="5">5</option><option value="6">6</option>
                <option value="7">7</option><option value="8">8</option><option value="9">9</option>
            </select>
        </div>
        
        <div class="number-box">
            <h3 style="color:#2ecc71">두 번째</h3>
            <select class="two">
                <option value="1">1</option><option value="2">2</option><option value="3">3</option>
                <option value="4">4</option><option value="5">5</option><option value="6">6</option>
                <option value="7">7</option><option value="8">8</option><option value="9">9</option>
            </select>
        </div>

        <div class="number-box">
            <h3 style="color:#e67e22">세 번째</h3>
            <select class="three">
                <option value="1">1</option><option value="2">2</option><option value="3">3</option>
                <option value="4">4</option><option value="5">5</option><option value="6">6</option>
                <option value="7">7</option><option value="8">8</option><option value="9">9</option>
            </select>
        </div>
    </div>
    
    <button class="btn">공 던지기 ⚾</button>
    
    <div class="scoreboard">
        <span class="scoreboard-title">📊 경기 현황판</span>
        <ul id="log">
            </ul>
    </div>
</div>
<script>
	
	
</script>
</body>
</html>