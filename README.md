# Android Studio 
`필요 : MVVM 아키텍처 이해`
## 플랫폼 아키텍쳐
  ![img.png](img.png)
  - [플랫폼 아키텍쳐](https://developer.android.com/guide/platform?hl=ko)
  - 구성
    - 리눅스 커널
    - 하드웨어 추상화 계층 (HAL)
    - 안드로이드 런타임(ART)
    - *Java API Framework*
    - 시스템 앱

## 코드명, 버전, API 레벨
  - [코드명, 버전, API 레벨](https://source.android.com/docs/setup/about/build-numbers?hl=ko) 

## 안드로이드 프로젝트 디렉터리 구조
```
MyAndroidApp/
 ├── .idea/                      # 프로젝트 설정 파일
 ├── app/                        # 메인 애플리케이션 모듈
 │    ├── build/                 # 빌드된 파일들
 │    ├── src/                   # 소스 코드 디렉터리
 │    │   ├── main/              # 메인 소스 파일
 │    │   │   ├── java/          # Java/Kotlin 소스 코드
 │    │   │   │   └── com/
 │    │   │   │       └── example/
 │    │   │   │           └── myandroidapp/
 │    │   │   │               └── MainActivity.java  # 메인 액티비티
 │    │   │   ├── res/           # 리소스 파일들
 │    │   │   │   ├── drawable/  # 이미지 파일
 │    │   │   │   ├── layout/    # 레이아웃 XML 파일
 │    │   │   │   ├── mipmap/    # 앱 아이콘
 │    │   │   │   ├── values/    # 문자열, 색상, 스타일 등
 │    │   │   └── AndroidManifest.xml  # 애플리케이션 매니페스트 파일
 │    │   ├── androidTest/       # 통합 테스트 소스
 │    │   └── test/              # 유닛 테스트 소스
 │    └── build.gradle           # 모듈별 빌드 파일
 ├── build/                      # 최상위 빌드된 파일들
 ├── gradle/                     # 그레이들 설정 디렉터리
 ├── .gitignore                  # 깃 무시 파일
 ├── build.gradle                # 최상위 빌드 파일
 └── settings.gradle             # 프로젝트 포함 모듈 설정
```

## 안드로이드 앱 컴포넌트
  1. Activity : 앱의 화면을 담당하는 기본 구성요소
  2. Intent : 액티비티 간의 전환 또는 외부 앱과의 데이터 교환을 위한 메시지
  3. Service : 백그라운드에서 동작하는 작업 단위
  4. Broadcast Receiver : 시스템 또는 다른 앱에서 발생하는 이벤트 수신
     - 이벤트 종류 : 시스템 부팅 완료, 네트워크 상태 변경, 배터리 상태 변경, 시간 변경, 사용자 정의 이벤트 등
       다양한 시스템 이벤트나 사용자 정의 이벤트를 broadcast 하여 receiver 가 수신할 수 있다. 
       앱은 시스템 및 사용자의 활동을 감지하고 적절히 대응할 수 있다.
  5. Content Provider : 앱 간 데이터 공유를 위한 인터페이스

## 안드로이드 개발환경
  - 안드로이드 스튜디오(IDE)
  - 안드로이드 SDK : 안드로이드 앱을 개발하기 위한 도구 및 라이브러리 모음
  - 애뮬레이터(Emulator, AVD) : 안드로이드 앱을 테스트할 수 있는 가상 디바이스 

## XML(extensible Markup Language)
  - 데이터를 구조화하고 나타내는 마크업 언어
  - 사람이 이해할 수 있는 구조
  - 기계가 해석할 수 있는 데이터 형식 
  - 반정형 데이터

### XML 구성요소
  1. 선언부
  2. 태그 (Tag)
     - 데이터를 감싸는 구조화된 요소
     - 시작태그와 종료태그의 쌍으로 이루어짐 (열면 닫아야 함)
```xml
<data>데이터 내용</data>
```
  3. 엘리먼트 (Element)
     - 시작 태그와 종료 태그 사이에 있는 컨텐츠
     - 태그 내부의 하위 태그, 하위 엘리멘트(요소)를 포함
     - 엘리먼트(요소) = 태그 + 컨텐츠(내용)
```xml
<person>
    <name>홍길동</name>
    <age>30</age>
</person>
```
  4. 속성 (Attribute)
     - 태그에 추가 정보를 제공
     - Key-Value 쌍 
```xml
<person name="홍길동" age="30" />
```
  5. 네임스페이스 (Namespace)
     - 태그 이름의 충돌을 피하기 위해 고유한 접두사를 부여
     - 선언부 또는 태그 내부의 'xmlns' 속성을 사용하여 URI로 정의
```xml
<myname:person xmlns:myname="http://myname.com/myname">
    <myname:name>홍길동</myname:name>
</myname:person>
```

  - 주의사항
    - XML 태그는 대소문자를 구분한다
    - 태그의 쌍은 정확하게 매칭이 되어야 한다
    - 속성의 값은 반드시 큰따옴표나 작은따옴표로 감싸야 한다
    - 루트 엘리먼트(최상위)는 하나여야 한다

## 뷰의 레이아웃
  - [뷰의 레이아웃](https://developer.android.com/develop/ui/views/layout/declaring-layout?hl=ko)
    - ![img_1.png](img_1.png)
    - UI 인터페이스를 만드는 방법 2가지
      1. [런타임에 레이아웃 요소 인스턴스화](ch01_layout/src/main/java/com/busanit/ch01_layout/pr01/Test1Activity.kt)
      2. [XML로 선언해서 런타임에서 실행](ch01_layout/src/main/res/layout/activity_test2.xml) 
        이후 Test2Activity.kt 에서 `setContentView(R.layout.activity_test2)`로 화면에 출력될 레이아웃 XML을 매개변수에 명시
  - View 클래스 : (화면 구성과 관련된 클래스)
    - ViewGroup : View 의 하위클래스지만. 화면에는 아무것도 출력하지 않고 다른 뷰 여러개를 묶는 그릇 역할 클래스
      - XXXLayout : 뷰의 컨테이너 역할
    - TextView, XXXView : 특정 UI를 출력할 목적으로 사용하는 클래스 
    
## 뷰 바인딩
  - 레이아웃 XML 파일에 선언한 뷰 객체를 코드에서 쉽게 이용하는 방법
  - 모듈 단위 build.gradle 파일 android 영역에 설정 선언 추가
    ```
    android {
        ... (생략)
        viewBinding { enable = true }
        ...
    }
    ...
    ```
  - Gradle 을 동기화하면, 자동으로 뷰 객체 포함하는 클래스가 생성
  - 레이아웃 XML 파일의 이름을 따름
    - 클래스이름 : 첫글자 및 _ 뒤를 대문자로 바꾼 후 'Binding' 추가
      - activity_main.xml -> ActivityMainBinding
      ```kt
      // 바인딩 객체로 화면을 출력
        setContentView(binding.root)

        // xml 의 요소들을 뷰 객체로 선언할 필요 없이
        binding.visibleButton.setOnClickListener {
            binding.targetView.visibility = View.VISIBLE
        }

        binding.invisibleButton.setOnClickListener {
            binding.targetView.visibility = View.INVISIBLE
        }
      ```