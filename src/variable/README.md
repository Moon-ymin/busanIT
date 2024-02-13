## 자바 입력 뜯어보기
- https://st-lab.tistory.com/41

1. 자바는 내부적으로 (메모리 상에서) 문자열이 UTF-16으로 인코딩되어 처리된다.
2. 문자열 송/수신을 위해 직렬화가 필요할 때에는 변형된 UTF-8을 사용한다.
3. 문자열을 입출력할 때는 운영체제 기본 인코딩값, 혹은 사용자가 지정한 인코딩 값으로 문자열을 인코딩한다. (내부 메모리상에서 처리되는 것과는 다르다.)
4. 1~127까지는 ASCII코드 값과 유니코드, MS계열 코드의 값이 같다.

### # System.in 그리고 InputStream
- 자바의 가장 기본인 입력 스트림은 InputStream
- System.in은 InputStream 타입의 필드


### # Scanner(System.in)과 InputStreamReader()
- InputStreamReader는 InputStream가 문자를 그대로 읽지 못하는 한계에 좀 더 효율적인 입력을 위해 중개자 역할인
InputStreamReader를 쓴다. 
- public Scanner(InputStream source) { this( new InputStreamReader(source), WHITESPACE_PATTERN); }
=> InputStreamReader sr = new InputStreamReader(System.in);

1. InputStream(바이트스트림)을 통해 입력 받음
2. 문자로 온전하게 받기 위해서 중개자 역할을 하는 InputStreamReader(문자스트림)
을 통해 char 타입으로 데이터를 처리함
3. 입력받은 문자는 입력 메소드 (next(), nextInt()등)의 타입에 맞게 정규식을 검사함
4. 정규식 문자열을 Pattern.compile()이라는 메소드를 통해 Pattern 타입으로 변환
5. 반환된 Pattern 타입을 String으로 변환함
6. String은 입력 메소드의 타입에 맞게 반환함 


### # BufferedReader() 그리고 InputStreamReader(System.in)
- BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
1. InputStream inputstream = System.in;
   1) 기본적으로 바이트 스트림인 InputStream을 통해 바이트 단위로 데이터를 입력을 받음
2. InputStreamReader sr = new InputStreamReader(inputstream);
   1) 입력 데이터를 char형태로 처리하기 위해 중개자 역할인 문자 스트림 InputStreamReader로 감싸준다
3. BufferedReader br = new BufferedReader(sr);

- BufferedReader는 길이가 가변적인 '문자열'을 입력받기 위해 필요해짐
  1. Byte Type = InputStream
  2. Char Type = InputStreamReader
  3. Char Type의 직렬화 = BufferedReader
  System.in = InputStream -> InputStreamReader -> BufferedReader

- BufferedReader의 특징
  1. 버퍼가 있는 스트림
  2. 별다른 정규식을 검사하지 않는다
  3. 하나하나 문자를 보내는 것이 아닌 한 번에 모아둔 다음 보내니 훨씬 속도가 빠르고 
별다른 정규식을 검사하지 않으니 더더욱 속도는 빠르다!

### 결론
- Scanner보다 BufferedReader를 통해 문자열을 받아온 뒤, Integer.parseInt()같은 파싱
함수를 통해 타입 변환해주는 것이 특히 성능(시간) 경쟁인 알고리즘에서 훨씬 선호된다.

### nextInt, nextLine의 차이
* https://st-lab.tistory.com/92
  
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();

        System.out.println(s1); Cat
        System.out.println(s2); is
        System.out.println(s3); 줄바꿈이 포함되어버림
        System.out.println(s4); perfect

        ~ 맞는 방법 ~
        String s1 = sc.next();
        String s2 = sc.next();
        sc.nextLine(); 개행이 s3에 담기지 않도록 개행만 입력시킴
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
  
