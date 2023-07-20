public class Main {
    public static void main(String[] args) {
        String[][] Animals = new String[3][3];
             Animals[0][0]="Cow";
             Animals[0][1]="Monkey";
             Animals[0][2]="Donkey";
             Animals[1][0]="Duck";
             Animals[1][1]="Cat";
             Animals[1][2]="Sheep";
             Animals[2][0]="Bear";
             Animals[2][1]="Dog";
             Animals[2][2]="Snake";
        for (int a=0;a<3;a++){
            System.out.println("-------------------------------");
            for (int b=0;b<3;b++){
               System.out.println(Animals[a][b]);
            }
        }
    }
}