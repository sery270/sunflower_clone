# 🌻 세리의 SunFlower CloneCoding 프로젝트 !

**[SunFlower](https://github.com/android/sunflower) 프로젝트는 Android Jetpack을 사용한 Android 개발 권장사항을 보여주는 앱으로, Android developer에서 추천하는 자료이다.** 

SunFlower 앱은 Android Jetpack을 잘 사용하고 있어 Jetpack을 공부하기에 좋은 앱인 것 같아, 파헤쳐 보기로 했다. 

## SunFlower 소개

SunFlower는 꽃 리스트를 보고 자신의 정원에 심고 싶은 꽃을 선택에 자신의 정원에 추가하는 기능이 주기능인 앱이다. 

SunFlower의 구조로는 단 하나의 Activity만 사용하였으며, 나머지 화면들은 모두 Fragment로 구성되어있다. 이 Fragment간의 교체는 Jetpack의 Navigation을 사용하였다.

각 Fragment들은 ConstraintLayout을 사용하여 작성되었고, data binding을 통해 데이터를 View에 뿌려주고 있다. 이와 관련하여, UI를 업데이트 하는데에는 ViewModel과 LiveData가 사용되었다

꽃 리스트들을 저장하는 곳은 Room을 사용하였다.

앱 테스트는 JUnit과 익스프레소가 사용되었다.

<br/>

> 추후 업데이트 ...

<br/>

## SunFlower_CloneCoding 프로젝트의 conventions

협업을 할 때마다, 컨벤션의 중요성을 느끼고 있다. 따라서 일단 git/github Convention을 정의하고 지키려한다. 또한 SunFlower_CloneCoding 프로젝트를 진행하면서, SunFlower에서 사용된 coding Convention에 대해서도 차차 정리해보려한다. 

### commit convention

> [Add Codes] - 새로운 코드를 추가했을 경우

> [Refactor Codes] - 기존에 작성한 코드를 수정했을 경우

> [Implement Features] - 새로운 기능을 추가하거나 완성했을 경우

> [Fix Bugs] - 오류를 해결했을 경우

> [Docs] - readme, wiki 작성한 경우

> [Create UI XML] - 새로운 xml 파일을 생성했을 경우

<br/>

### coding convention

> 추후 업데이트 ...

<br/>

### foldering

> 추후 업데이트 ...

<br/>

## SunFlower CloneCoding 개발일지

### 👏🏻 2020/08/04 월

- [SunFlower](https://github.com/android/sunflower) 를 클론 받아서 열어보았는데, 단 하나의 activity, GardenActivity와 나머지 fragment들로 구성되어있었다. 화면의 기본 단위로 fragment를 사용한 것 같았다. 이렇게 activity를 최소한으로 사용한 이유는 리소스 절약에 있어 효율적인 구현을 위한 것이라 생각했다.

- 또한 GardenActivity.kt 아무런 내용이 없었는데, 이는 View와 데이터를 구분하기위한, 즉 MVVM의 모습일 것이라고 생각했다.

<br/>

### 👏🏻 2020/08/06 목

- [SunFlower](https://github.com/android/sunflower) 의 진짜 첫 화면이 되는, nav_garden.xml를 보았는데, 해당 navigation이라는 res 파일엔, 각각의 fragment들이 연결되어있었다. 그래서 이 navigation이란 무엇인지 공부하였다.

- [Android JetPack의 Navigaiton를 공부하고 정리한 WiKi](https://github.com/sery270/sunflower_clone/wiki/%5BAndroidx.Navigation%5D)

<br/>

### 👏🏻 2020/08/10 월

- MVVM의 전반적인 개념에 대해서 전반적으로 공부했다.
- **요약**

    Model 🍅🥬 :: View에 표시할 데이터 정의 담당

    ☇ :: data processing

    ViewModel 👩🏻‍🍳🧑🏾‍🍳:: UI 및 데이터 렌더링 담당

    ☇ :: data binding

    View 🍽🥣 :: View에 표시할 데이터 처리 및 사용자와의 인터렉션과 라이프 사이클 관련 처리 담당

- [MVVM의 개념을 공부하고 정리한 WiKi](https://github.com/sery270/sunflower_clone/wiki/About-MVVM-Concept)
