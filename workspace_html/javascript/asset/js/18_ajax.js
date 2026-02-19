window.addEventListener('load', bind);


function bind() {
    const btn1 = document.querySelector('#btn1')
    btn1.addEventListener('click', function () {

        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // method, 주소
        xhr.open('get', 'https://jsonplaceholder.typicode.com/users')

        // 보내기
        xhr.send()
        console.log(xhr.responseText) //데이터를 가지러 갔지만 아직 가져오지는못한상태

        // 다녀왔다면 
        xhr.onload = function () {
            console.log('다녀왔엉')
            console.log(xhr.responseText) //데이터를 가져와서 로딩이끝난상태

            // 깜짝 퀴즈 
            // 두번쨰 사람의 이름을 출력
            // 세번쨰 사람의 lat을 출력 
            const xhr2 = JSON.parse(xhr.responseText)
            console.log(xhr2)

            console.log(xhr2[1].name)
            console.log(xhr2[1]['name'])
            console.log(xhr2[2].address.geo.lat)
            console.log(xhr2[2]['address']['geo']['lat'])

        }

    })
    document.querySelector('#btn2').addEventListener('click', function () {
        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // method, 주소
        xhr.open('get', '17_json.html')

        // 보내기
        xhr.send()
        console.log(xhr.responseText) //데이터를 가지러 갔지만 아직 가져오지는못한상태

        xhr.onload = function () {
            console.log('두 번째 데이터 도착!');
            console.log(xhr.responseText); // 가져온 HTML 내용이 보일 거야
        }
    })
    document.querySelector('#btn3').addEventListener('click', function () {

        const xhr = new XMLHttpRequest();

        const key = 'fd6ee37e1038054642391335a94d5713a159a1b5f9a8d59d8db97bace2ba27f6'
        let url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst'
        url += '?serviceKey=' + key
        url += '&numOfRows=1000'
        url += '&pageNo=1'
        url += '&dataType=JSON'
        url += '&base_date=20260212'
        url += '&base_time=1300'
        url += '&nx=63'
        url += '&ny=110'

        xhr.open('get', url)
        xhr.send()
        console.log(xhr.responseText) //데이터를 가지러 갔지만 아직 가져오지는못한상태

        xhr.onload = function () {
            console.log('날씨 예보 도착!');
            // console.log(xhr.responseText); // 가져온 HTML 내용이 보일 거야
            const data = JSON.parse(xhr.responseText)
            console.log(data)

            // 첫번째 자료의 category, fcstValue 출력 
            // T1H(기온), RN1(강수량) ,REH(습도) 출력
            const b = data.response.body.items.item[0].category
            const b1 = data.response.body.items.item
            const c = data.response.body.items.item

            console.log(data.response.body.items.item[0].category)
            console.log(data.response.body.items.item[0].fcstValue)
            console.log(data.response.body.items.item[24].category)

            // 이렇게도 해보자 
            let json = {
                '1400': {
                    T1H: 8,
                    RN1: '강수없음',
                    REH: 45
                }

            }
            json.T1H = {}
            json['RN1'] = {}
            json['REH'] = {}



            for (let i = 0; i < c.length; i++) {
                if (b1[i].category == 'T1H' || b1[i].category == 'RN1' ||
                    b1[i].category == 'REH'
                ) {
                    console.log(c[i])
                    document.querySelector('#temp').innerHTML +=
                        `
                    <tr>
                        <td>${c[i].fcstTime}</td>
                        <td>${c[i].fcstValue}</td>
                        <td>${c[i].fcstDate}</td>
                    </tr>
                    `
                }
            }
            // for (let i = 0; i < c.length; i++) {
            //     if (b1[i].category == 'RN1') {
            //         console.log('RN1', c[i])
            //     }
            // }
            // for (let i = 0; i < c.length; i++) {
            //     if (b1[i].category == 'REH') {
            //         console.log('REH', c[i])
            //     }
            // }

        }
    })

    const btn4 = document.querySelector('#btn4')
    btn4.addEventListener('click', function () {

        // const xhr = new XMLHttpRequest();
        // xhr.open('get', 'https://jsonplaceholder.typicode.com/users')
        // xhr.send()
        // xhr.onload = function () {
        //     let response = xhr.responseText
        //     let json = JSON.parse(response)
        //     console.log(json) 
        // }

        const url = 'https://jsonplaceholder.typicode.com/users'
        const option = {
            method: 'get'
        }

        fetch(url, option).then(function (response) {
            return response.json()
        }).then(function (json) {
            console.log(json)
        }).catch(function (error) {
            console.error(error)
        })

    })

    const btn5 = document.querySelector('#btn5')
    btn5.addEventListener('click', function () {

        const xhr = new XMLHttpRequest();
        xhr.open('get', 'https://jsonplaceholder.typicode.com/users')
        xhr.send()
        xhr.onreadystatechange = function () {
            console.log(xhr.readyState)
            if (xhr.readyState == 4) {
                // if(xhr.readyState == XMLHttpRequest.DONE){
                console.log('다녀왔어')
            }
        }

    })
    const btn6 = document.querySelector('#btn6')
    btn6.addEventListener('click', function () {


        $.ajax({
            url: 'https://jsonplaceholder.typicode.com/users',
            type: 'get', // method
            success: function (data) {
                console.log('성공')
                console.log(data)
            },
            error: function (error) {
                console.log('실패')
                console.log(error)
            },
            complete: function () {
                console.log('무조건 실행')
            }

        })
    })
    const btn7 = document.querySelector('#btn7')
    btn7.addEventListener('click', function () {


        $.ajax({
            url: 'https://jsonplaceholder.typicode.com/users',
            type: 'get', // method
        }).done(function (data) {
            console.log('성공')
            //자동으로 json으로 바뀌어 온다
            console.log(data)
        }).fail(function (error) {
            console.log('실패')
            console.log(error)
        }).always(function () {
            console.log('무조건 실행')
        })


    })

    btn4 = document.querySelector('#btn4')
    btn4.addEventListener('click', async function () {

        const url = 'https://jsonplaceholder.typicode.com/users'
        const option = {
            method: 'get'
        }

        // fetch(url, option).then(function (response) {
        //     return response.json()
        // }).then(function (json) {
        //     console.log(json)
        // }).catch(function (error) {
        //     console.error(error)
        // })
        let response = await fetch(url, option) 
        let json = await response.json()
        console.log(json) 

    })
}