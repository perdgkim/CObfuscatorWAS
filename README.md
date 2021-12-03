
<br/>

<img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/kdgyun/CObfuscator"> <a href="https://github.com/kdgyun/CObfuscator/blob/master/LICENSE"><img alt="GitHub license" src="https://img.shields.io/github/license/kdgyun/CObfuscator"></a> 

<img src= "https://img.shields.io/badge/Java-v11.0.5-blue&?logo=Java&color=blue"/> <img src= "https://img.shields.io/badge/node.js-v16.13.0-339933&?logo=Node.js&color=339933"/>  <img src= "https://img.shields.io/badge/npm-v8.1.0-CB3837&?logo=npm&color=CB3837"/> <a href="https://github.com/kdgyun/CObfuscator/issues"><img alt="GitHub issues" src="https://img.shields.io/github/issues/kdgyun/CObfuscator"></a> ![example branch parameter](https://github.com/kdgyun/CObfuscator/actions/workflows/codeql-analysis.yml/badge.svg?branch=master) 

<br/><br/><br/>

# C Obfuscator Web Service


<br/>

C 또는 C++ 언어로 작성 된 소스코드를 난독화(Obfuscated)해주는 프로그램을 제공하는 웹 서비스입니다.

<br/>


\>\> [CObfuscator_바로가기](http://3.88.0.190)

<br/>  


Project
-----------
<br/>

#### CObfuscator in lib



> - C/C++ 를 난독화하는 프로그램이 구현되어있습니다.
> - Java11 이상 버전을 기준으로 구현됩니다.
> - Java11 API : [Java API](https://docs.oracle.com/en/java/javase/11/docs/api/index.html)
> - node.js 와 npm을 사용합니다. node.js 설치를 할 경우 대부분 자동으로 PATH를 잡아주지만, 간혹 안되는 경우도 있으니 환경변수는 필히 확인하고 설정해주셔야 합니다.
> - UNIX 계열 OS에 최적화되어있습니다. (추후 OS 확장 예정)
> - input에 주어지는 filename의 확장자는 .c .cpp .cc 이 들어올 수 있습니다.

<br/>

해당 모듈의 자세한 내용은 해당 프로젝트 내의 [repository](./com.tistory.stlab.obfu/lib/README.md) 에서 확인하실 수 있습니다.

또는 실제 배포용으로 공개 된 모듈은 저의 다른 공개 계정인 [repository](https://github.com/kdgyun/CObfuscator) 에서 확인하실 수 있습니다.



<br/>
<br/>

#### What is C Obfuscator?

---

<br/>

C Obfuscator는 C 혹은 C++로 작성 된 소스코드의 난독화를 해주는 도구입니다.
기본적으로 C Obfuscator 크게 아래의 4가지 과정을 거치게 됩니다.

<br/>

1. 대상 파일을 읽고 정규식 구문분석을 통한 token화 및 라벨링(type 분류)
2. 분류 된 token들 중 난독화가 가능한 구문과 불가능한 구문을 분리
3. 난독화 가능한 구문들을 type별로 변환 가능한 전처리 방식으로 변환 방식 분류
4. 랜덤값 및 랜덤 길이를 통해 임의의 값으로 치환



<br/>

위와 같이 임의의 값을 통해 치환되기 때문에 동일한 내용을 난독화 하더라도 서로 다른 결과를 보여 identify를 보장할 수 있습니다.




<br/>
<br/>

#### Why we need?

---

<br/>

우리는 많은 소스코드를 오픈소스화하여 다양한 사람과 공유하기도 합니다. 

하지만 라이선스 혹은 불가피한 이유로 인해 특정 소스코드를 보호하고 싶음에도 올려야 할 일들이 종종 발생하기도 합니다. 이럴 때 우리는 소스코드 분석을 어렵게 하여 코드 분석 시도를 방지할 수 있습니다.
또한 오픈소스로 공개되다보니 몇몇 소수의 악의적인 목적으로 버그를 발생시키거나 불법적인 일들을 시도하려고 하는 일들도 발생하곤 합니다.
이러한 이유에서도 악의적 목적으로 소스코드를 풀어내기 어렵게 하여 목적 달성을 방지 혹은 지연시킬 수 있다는 점이 있습니다.


<br/><br/>

Web Preview
-----------------

<br/><br/>

### \[home]

![home](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/home.png)

<br/><br/>

### \[intro]

![intro](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/intro.png)

<br/><br/>

### \[work]

![work](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/work.png)

<br/>

![workinput](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/workinput.png)

<br/>

![workoutput](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/workoutput.png)

<br/><br/>

### \[about]

![about](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/about.png)


<br/><br/>

### \[contact]

![contact](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/contact.png)

<br/><br/>

How to use
-----------------

<br/>

사용 방법은 간단합니다!
work 페이지에서 소스코드 작성 혹은 붙여넣은 뒤, submit 버튼을 누르면 끝입니다 :)

\[예시]

![preview](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/preview.gif)


<br/><br/>

Diagram
-----------------

<br/>

이 프로젝트는 다음과 같은 구조를 갖습니다.

![diagram](https://github.com/perdgkim/CObfuscatorWAS/blob/main/static/demo/imgs/diagram.jpg)

좀 더 자세하게 보려면 [여기](https://sketchboard.me/XC0oJuCgMdoF#/)를 클릭해주세요.


<br/><br/>

Authors
---

<br/>

- Authors : Donggyun Kim
- email : kdonggyun97@gmail.com
- main github : https://github.com/kdgyun/
- blog : https://st-lab.tistory.com/


<br/><br/>

License
---

```
   Copyright 2021 kdgyun All rights reserved.
  
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
  
       http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```


