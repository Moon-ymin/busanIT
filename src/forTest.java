import class1.ex.GameCharacter;
import static0.ex.MathUtility;

import static static0.ex.MathUtility.*;
import static static0.ex.MathUtility.factorial;

public class forTest {
    // 1. 구구단
    public void guguDan( int a ) {
        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a*i);
        }
    }

    // 2. switch 활용 계산기
    public void cal( int a, int b, String op ) {
        switch(op) {
            case "+":
                System.out.printf("%d + %d = %d\n", a, b, a+b);
                break;
            case "-":
                System.out.printf("%d - %d = %d\n", a, b, a-b);
                break;
            case "*":
                System.out.printf("%d * %d = %d\n", a, b, a*b);
                break;
            case "/":
                System.out.printf("%d / %d = %d\n", a, b, a/b);
                break;
        }
    }

    // 3. random한 숫자로 up down 맞추기 ../loop/Ex8
    public void game(){
        Random r = new Random();
        int answer = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int tries = 0;

        while(true) {
            System.out.println("예상하는 숫자는? : ");
            int n = sc.nextInt();
            tries += 1;

            if (answer ==n) {
                System.out.println(tries+"번 만에 정답입니다!");
                break;
            } else if (answer > n) {
                System.out.println("예상하는 숫자보다 큽니다");
            } else {
                System.out.println("예상하는 숫자보다 작습니다.");
            }
        }
    }

    // 4. 배열 2차원 합계 구하기
    public void Ex4{
        int[][] matrix = {
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };

        int sum = 0;
        for(int[] rows : matrix) {
            for (int cols : rows) {
                sum += cols;
            }
        }
        System.out.println("모든 요소의 합은 : "+ sum);
    }

    // 5. 상품을 주문하는 클래스 만들기
    public class ProductOrder {
        String productName;
        int price;
        int quantity;
    }
    public class Ex5{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("주문의 개수를 입력하세요 : ");
            int times = sc.nextInt();

            String[] productNames = new String[times];
            int[] prices = new int[times];
            int[] quantities = new int[times];

            for (int i = 0; i < times; i++) {
                System.out.println("상품 주문을 입력하세요.");
                System.out.print("상품명 : ");
                productNames[i] = sc.next();
                System.out.print("가격 : ");
                prices[i] = sc.nextInt();
                System.out.print("수량 : ");
                quantities[i] = sc.nextInt();
            }

            System.out.println("주문 상품 정보");
            for (int i = 0; i < times; i++) {
                ProductOrder product = createOrder( productNames[i], prices[i], quantities[i]);
                printOrder( product );

            }

            getTotalPayment( prices , quantities );

        }
        public static ProductOrder createOrder( String productName, int price, int quantity) {
            ProductOrder order = new ProductOrder();
            order.productName = productName;
            order.price = price;
            order.quantity = quantity;
            return order;
        }

        public static void printOrder( ProductOrder p ) {
            System.out.println("상품명 : "+p.productName+", 가격 : "+p.price+"원, 주문 수량 : "+p.quantity+"개");
        }

        public static void getTotalPayment( int[] prices, int[] quantities ) {
            int sum = 0;
            for(int i=0; i<prices.length; i++) {
                sum += prices[i] * quantities[i];
            }
            System.out.println("총 결제 금액 : " + sum);
        }

    }

    // 6. 게임 캐릭터 설계하기
    public class Ex6{
        public class GameCharacter {
            String name;
            int level;
            int health;

            GameCharacter(String name, int level, int health) {
                this.name = name;
                this.level = level;
                this.health = health;
            }
            void attack() {
                System.out.println(name + "의 공격!");
            }
            void takeDamage( int damage ) {
                this.health = health;
                System.out.println(name + "이 공격을 받았습니다."
                        + damage + "를 입었습니다. 체력이"
                        + health + "남았습니다."
                );
            }
        }
        public static void main(String[] args) {
            GameCharacter david = new GameCharacter("David",10,100);
            GameCharacter peter = new GameCharacter("Peter",20,200);

            david.attack();
            peter.takeDamage(10);

            peter.attack();
            david.takeDamage(20);
        }
    }

    // 7. 장바구니 클래스 설계
    public class Ex5 {
        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();

            Item item1 = new Item("당근", 1500, 3);
            Item item2 = new Item("양파", 2000, 5);

            cart.addItem(item1);
            cart.addItem(item2);

            cart.displayItems();
        }
    }

    public class Item {
        String name;
        int price;
        int quantity;

        public Item(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public class ShoppingCart {
        Item[] items;
        int itemCount;

        ShoppingCart() {
            items = new Item[10];
        }
        public void addItem( Item item ){
            if ( itemCount >= 10 ){
                System.out.println("장바구니가 가득 찼습니다.");
            } else {
                // 배열 items에 넣기
                items[itemCount] = item;
                itemCount++;
            }
        }
        public void displayItems(){
            int total = 0;
            System.out.println("장바구니 상품 출력");


            for (int i = 0; i < itemCount; i++) {
                System.out.printf("상품명 : %s, 합계 : %d\n",
                        items[i].getName(), items[i].getPrice() * items[i].getQuantity() );
                total += items[i].getPrice() * items[i].getQuantity();
            }

            System.out.println("전체 가격 합: "+total);
        }
    }


    // 8. MathUtility
    public class MathUtility {

        public static int max(int a, int b) {
            return ( a > b ? a : b);
        }

        public static int min(int a, int b) {
            return ( a > b ? b : a);
        }

        public static int sum(int a, int b) {
            return a + b;
        }

        public static int factorial(int n) {
            if (n==1) return 1;
            return n*factorial(n-1);
        }
    }

    public class Ex2 {
        public static void main(String[] args) {
            // 객체 생성 없이 호출하기 위해 MathUtility에서 static메소드 만듦
            System.out.println("Max of 10, 20: " + static0.ex.MathUtility.max(10, 20));
            System.out.println("Min of 10, 20: " + static0.ex.MathUtility.min(10, 20));
            System.out.println("Sum of 10, 20: " + static0.ex.MathUtility.sum(10, 20));
            System.out.println("Factorial of 5: " + static0.ex.MathUtility.factorial(5));

            System.out.println("---------------------------------------------------");

            // MathUtility 부분 alt+enter해서
            // 스태틱 import를 사용하면 클래스 이름 생략하고 메서드 호출 가능
            System.out.println("Max of 10, 20: " + max(10, 20));
            System.out.println("Min of 10, 20: " + min(10, 20));
            System.out.println("Sum of 10, 20: " + sum(10, 20));
            System.out.println("Factorial of 5: " + factorial(5));
        }
    }


}
