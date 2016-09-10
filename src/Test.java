

/**
 * Created by Administrator on 2016/9/7 0007.
 */
public class Test {
    public static void main(String[] args) {
        int i=101;
        for (i=101;i<=200;i++){
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0&&i%11!=0&&i%13!=0){
                System.out.println(i);

            }
        }
        System.out.println("南无地藏菩萨摩诃萨");
        int k=100;
        for (k=100;k<=999;k++){
            if ((k%10)*(k%10)*(k%10)+((k/10)%10)*((k/10)%10)*((k/10)%10)+(k/100)*(k/100)*(k/100)==k){
                System.out.println(k);
            }


        }
        System.out.println("南无地藏菩萨摩诃萨");
        int score=5;

        if (score>=90) {
            System.out.println('A');
        }else if (score<=89&&score>=60){
            System.out.println('B');

        }else {
            System.out.println('C');
        }











    }
}

