# 🌻 세리의 SunFlower CloneCoding 프로젝트 !

**[SunFlower](https://github.com/android/sunflower) 프로젝트는 Android Jetpack을 사용한 Android 개발 권장사항을 보여주는 앱으로, Android developer에서 추천하는 자료이다.**

SunFlower 앱은 Android Jetpack을 잘 사용하고 있어 Jetpack을 공부하기에 좋은 앱인 것 같아, 파헤쳐 보기로 했다.

## SunFlower 소개

SunFlower는 꽃 리스트를 보고 자신의 정원에 심고 싶은 꽃을 선택에 자신의 정원에 추가하는 기능이 주기능인 앱이다.

공부하려 하는 이 SunFlower에 사용된 Jetpack components들을 살펴보자면, 아래와 같다.

- SunFlower는 Kotlin으로 작성되었고, 이 Kotlin의 확장 프로그램 (확장 함수, 확장 속성, 람다, 이름이 지정된 매개변수, 코루틴)인 Android KTX를 사용하여 더 간결하고 코틀린다운 코드를 작성하였다.
- 이 앱을 싱글 Activity와 여러 Fragment들로 구성되었으며, 이 Fragment들의 전환은 Jetpack의 Navigation과 전환 Animation을 통해 구현되었다.
- 따라서 사용하는 각 Fragment 화면은 ConstreaintLayout 과 Data Binding으로 생성되었다.
- 내부 저장소로 구현된 the plant list와 my garden entries의 운영은 아래와 같다.
    - 데이터베이스단의 처리> Room
    - UI단의 처리> LiveData를 통한 ViewModels

> 아래는 추후 업데이트 ...

- [~~AppCompat](https://developer.android.com/topic/libraries/support-library/packages#v7-appcompat) is used to preserve key app functionality on older versions of Android~~
- ~~Background tasks are handled by [WorkManager](https://developer.android.com/topic/libraries/architecture/workmanager)~~
- ~~Plant details can be [shared](https://developer.android.com/training/sharing/shareaction) with other applications on the device, or simply copied to the clipboard~~
- [~~Testing](https://developer.android.com/training/testing/) is performed by both [local JUnit tests](https://developer.android.com/training/testing/unit-testing/) and [Espresso](https://developer.android.com/training/testing/espresso/) Android UI tests~~

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

### 👏🏻 2020/09/03 목

- 클론 코딩을 진행하면서, xml 상에서 특정 속성에 대한 값을 넣어줄 때, 아래의 경우를 발견했었다.
    - @로 시작하는 값 → 개발자가 정의한 부분을 id를 통해 참조
    - ?로 시작하는 값 → 안드로이드 스튜디오에서 제공해주는 값, generated된 파일인 values.xml 참조
    - 하드 코딩 → xml에 직접 박아 넣는 값
    - @{viewModel.plant.description} 변수를 통해 전달하는 값

    따라 하면서, @, 하드 코딩 부분은 에러가 없었지만, ?attr/으로 시작하는 값에 대해 넣어줄 때 에러가 났었고, 해결하기 위해 방법을 찾아보았다. 

    ![https://user-images.githubusercontent.com/59532818/92094037-f5dbd880-ee0e-11ea-8cda-ca2d9b1a827d.png](https://user-images.githubusercontent.com/59532818/92094037-f5dbd880-ee0e-11ea-8cda-ca2d9b1a827d.png)

- 원본과 비교해 보았을 때, 위에서 말한 그 values.xml의 내용이 달라서, 에러가 생기는 것이었다. 이를 해결하기 위해서 해당 파일을 수정하려 했으나, 이는 안드로이드 스튜디오 상에서 generated된 파일이어서 올바른 접근이 아니었고, generated 된 파일이라면 gradle과 관련이 있다고 생각했다. 그래서 gradle을 통일 시켰다.
    1. project structure > Variables 의 값 통일

        ![https://user-images.githubusercontent.com/59532818/92093426-4dc60f80-ee0e-11ea-92a7-f83a9634e7f8.png](https://user-images.githubusercontent.com/59532818/92093426-4dc60f80-ee0e-11ea-92a7-f83a9634e7f8.png)

    2. Build.gradle (Module : app) 통일
    3. Build.gradle (Project : sunflower_clone) 통일

    이렇게 통일 시켜 주면, 알아서 gradle 상의 내용이 project structure에도 반영된다. 또한 gradle의 내용에 따라, 에러의 원인 이었던 values.xml의 내용도 바뀌게 되는 것을 발견하였다. 그렇게 gradle의 간략한 역할과 마주 했던 ?attr/로 시작하는 값에 대한 에러도 해결되었다. 종종 gradle 작성에 대한 requirement도 보이는데, gradle에 대해서 정리해 보려 한다.
    
### 👏🏻 2020/09/09 수

- values의 파일들을 통일 하였다.
- 현재 plant_detail_fragment의 data 태그를 작성하려고 하는 중인데, 아래와 같은 파일들의 연관성을 파악하였다. 이 파일들을 폭 넓게 이해하기 위해서, 다음엔 여기서 사용되는 room에 대해서 공부하려한다.
    - Plant.kt - PlantDao.kt - PlantRepository.kt
    - gardenPlanting.kt && PlantAndGardenPlantings.kt - gardenPlantingDao.kt - gardenPlantingRepository.kt

- 또한 해당 파일들을 클론 코딩하면서 깨달은 점을 정리 해보았다.
    - 데이터 클래스 Plant :: 이 데이터 클래스는 하나의 테이블을 정의하고 있다.
    - 인터페이스 PlantDao.kt :: 이 인터페이스는 -Repository.kt 를 위한 인터페이스이다. 여기선 Plant.kt에서 정의한 테이블을 대상으로 하는 SQL들을(Query, Insert 등등) 정의하고 있다.
    - 클래스 PlantRepository.kt :: 이 클래스는 PlantDao.kt를 구현한 것으로, conpanion을 사용한 싱글톤을 사용하고 있다.
    - ![https://user-images.githubusercontent.com/59532818/92587496-b449a280-f2d2-11ea-8c0b-e6bc6088daaa.png](https://user-images.githubusercontent.com/59532818/92587496-b449a280-f2d2-11ea-8c0b-e6bc6088daaa.png)
- **추가적으로 정리한 클론 코딩 꿀팁**  **::** 원활한 클론 코딩을 위한 작성 순서
    - UI
        1. ?attr/ 을 사용하기 위해 Gradle 통일
        2. values의 7가지 파일들 anim, colors, dimens, integers, shape, strings, styles 통일
    - DATA
        1. fragment의 data 태그를 위한 class, interface 작성
        2. fragment의 xml 파일에서 data 태그를 통해 변수 사용
        
### 👏🏻 2020/09/17 목

- 내부 저장소, 즉 로컬 데이터베이스에 데이터를 저장하는 방법에 대해서 공부했다. 특히 기존의 SQLite가 아닌, jetPack의 Room에 대해서 공부하였다. 이 Room은 공식 문서에서 적극 권장하는 로컬 데이터베이스 활용 방법이다.
- Room은 크게 세 가지 구성요소가 있다.
    - @Database :: 데이터베이스 홀더 및 앱과 데이터간의 기본 액세스 포인트 역할을 한다
    - @Entity :: 데이터베이스의 각 테이블을 의미한다. (data class)
    - @DAO :: 각 Entity에 대한 SQL이 메서드로 정의되어있다. (Interface)

        *DAO == Data Access Objects

- 이 개념을 학습하고 Sunflower에서 사용된 Room에 대해 정리해보았다.
- ![https://user-images.githubusercontent.com/59532818/93456202-4c213f00-f918-11ea-8c5a-cc3925761e85.png](https://user-images.githubusercontent.com/59532818/93456202-4c213f00-f918-11ea-8c5a-cc3925761e85.png)


### 👏🏻 2020/09/29 화

- 오늘은 codelabs의 [Android Room with a View - Kotlin](https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/index.html?index=..%2F..index#9)를 보면서, [Android Room](https://developer.android.com/reference/androidx/room/package-summary)에 대한 [실습](https://github.com/sery270/RoomExamples_Codelabs)을 진행하였다.
- 아래 그림의 큰 그림을 가지고 [실습](https://github.com/sery270/RoomExamples_Codelabs)을 진행하였다. 현재는 repository까지 생성하였다. 지난 스터디 시간에 공부 했던, Room에 대한 이해가 해당 자료의 설명과 잘 fit되는 느낌이어서, 공부한 보람이 있었다.
- ![bigpics](https://user-images.githubusercontent.com/59532818/94538231-b7ef9a00-027e-11eb-96bf-07742c851e3c.png)
- MVVM 패턴과 관련하여, livedata에 대해서 접하게 되었는데, 아직 observer라는 개념이 생소한 상태이다. 대충 subscriber와 observer로 이루어져 UI단에서 data 처리 효율을 챙긴다. 정도로 이해하고 있다. 이 실습을 통해서, @Dao에서 선언한, livedata들이 관찰되고, 이 관찰된 livedata들이 자신의 변경 사항이 있을 때, 메인 스레드의 관찰자에게 알려서, UI단의 수정이 이루어지게 한다.
