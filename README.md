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

> [Create UI] - 새로운 xml 파일을 생성했을 경우

> [Chore] - 동작에 영향을 주는 코드 변경 없는 변경사항 (주석, 정렬 등등)

<br/>

### coding convention

> 추후 업데이트 ...

<br/>

### foldering

> 추후 업데이트 ...

<br/>

## SunFlower CloneCoding 프로젝트 TIL(Today I Learned)

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

<br/>

### 👏🏻 2020/08/13 목

- 주요 UI를 구성하는 파일들 (xml과 adapter, activity, fragment의 kt 파일들)의 용도와 흐름에 대해서 파악했다.

    ![https://user-images.githubusercontent.com/59532818/90112816-7321a980-dd8b-11ea-8614-94073b5d9b54.jpeg](https://user-images.githubusercontent.com/59532818/90112816-7321a980-dd8b-11ea-8614-94073b5d9b54.jpeg)

- 이렇게 binding이라는 객체를 통해 inflate 작업을 하는 것 같다. 근데 이 FragmentGardenBinding 이라는 클래스는 generated의 databinding 에 있는 클래스로, 직접 생성하는 것이 아니라, 자동으로 생성되는 부분이었다.

    ![https://user-images.githubusercontent.com/59532818/90112110-87b17200-dd8a-11ea-9686-2a200418ac4f.png](https://user-images.githubusercontent.com/59532818/90112110-87b17200-dd8a-11ea-9686-2a200418ac4f.png)

- viewpager2에 대해서 알게되었다. 이 viewpager2에 대해 사용할 수 있는 어뎁터로 크게 2가지가 있다. 이는 생명주기(상태)를 고려하느냐 안하느냐의 기능 차이가 있는 것 같다.
    - 생명주기를 고려할 땐 > [FragmentStateAdapter](https://developer.android.com/reference/androidx/viewpager2/adapter/FragmentStateAdapter)
    - 생명주기를 고려할 필요가 없을 땐 > [RecyclerView.Adapter](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.Adapter)
- galleryFragment 의 플로우가 없어서 헤메다가, Unsplash API key를 gradle.properties에 추가하여 해결하였다.

    ![https://user-images.githubusercontent.com/59532818/90110606-74050c00-dd88-11ea-86da-e9165bcde270.png](https://user-images.githubusercontent.com/59532818/90110606-74050c00-dd88-11ea-86da-e9165bcde270.png)

    ![https://user-images.githubusercontent.com/59532818/90110661-88e19f80-dd88-11ea-9a79-8b590b1202ba.png](https://user-images.githubusercontent.com/59532818/90110661-88e19f80-dd88-11ea-9a79-8b590b1202ba.png)

### 👏🏻 2020/08/18 화

- 주요 UI인 GalleryFragment, HomeViewPagerFragment, PlantDetailFragmenet, GardenActivity 를 직접 생성 해보고, navigation인 nav_garden으로 해당 activity 3가지 fragment를 연결시켜보았다. 이 과정에서 fragment안에 action, argument 태그를 넣어 사용할 수 있다는 점을 알게되었고, 각 태그의 속성에 대한 정리를 하고 있다.
- 연결 지점으로는 크게 Activity와 fragment로 나누어서 이해하였다.
    - Activity> 단 하나의 Activity인 GardenActivity엔 nav_host_fg라는 id를 가진 fragment가 존재한다. 이 fragment 태그에 아래 두 속성을 추가하면, **해당 fragment는 nav_garden 이라는 navigation에 정의된 fragment들이 동작할 위치**가 된다. 이를 **NavHost**라고 한다.

        ```
        app:defaultNavHost = "true"
        app:navGraph="@navigation/nav_garden"

        ```

        ![https://user-images.githubusercontent.com/59532818/90506817-d21e5e80-e18f-11ea-9e99-0663913f6225.png](https://user-images.githubusercontent.com/59532818/90506817-d21e5e80-e18f-11ea-9e99-0663913f6225.png)

    - fragment> 각 fragment의 UI들, 즉 아래 3개의 xml 파일들은, nav_garden에서 정의된 3개의 fragment들의 layout으로 사용된다. 즉, 해당 xml 파일들은 그냥 layout일 뿐이고, 실질적인 fragment가 자리할 위치는 바로 nav_garden의 iew_pager_fg, plant_detail_fg, gallery_fg 이다. 이 3개의 fragment들은 nav_garden에 종속된다. 다만 이들의 UI는 분리 되어있다. 즉, **기존 fragment의 inflate 방식과 다른 점으로, UI를 기능 동작과 분리 했다는 점에 주목할 수 있다**. 이것이 MVVM의 모습이라고 생각했다.

        ![https://user-images.githubusercontent.com/59532818/90506808-cdf24100-e18f-11ea-897d-bd66d7d3e3cb.png](https://user-images.githubusercontent.com/59532818/90506808-cdf24100-e18f-11ea-897d-bd66d7d3e3cb.png)

        [각 fragment들의 UI]

        ![https://user-images.githubusercontent.com/59532818/90506791-c894f680-e18f-11ea-9fae-f547186f2924.png](https://user-images.githubusercontent.com/59532818/90506791-c894f680-e18f-11ea-9fae-f547186f2924.png)

        [그 UI가 삽입되는, 실질적인 fragment들]

- appbar의 구현 방법 2가지에 대해서 알게 되었다. 크게 actionBar, toolBar를 활용하는 방법이 있는데, 현재는 toolBar의 구현 방법을 권장한다고 한다.
    - actionBar

        시스템 버전 별로 지원

    - toolBar

        jetPack으로 지원, 시스템 버전과 독립적임

        → 사용 권장!

- fragment 태그 속성
- fragment 안에 들어올 수 있는 태그들
    - action 태그 속성
    - argument 태그 속성
- anim의 translate 태그 속성
