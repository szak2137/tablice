import java.util.*;
public class Main {
    public static void main(String[] args) {

//        TODO 1)
//        utwórz tablicę ocen z jednego przedmiotu
//        wydrukuj tablicę
//        przypisz do kilku jej elementów oceny
//        wydruje je
//        oblicz średnią ocen nie używając funkcji wbudowanych
//        pokaż średnią ocen

//          int[] oceny = new int[10];
//          for(int i = 0; i < oceny.length; i++) {System.out.printf(oceny[i] + ", ");}
//          System.out.println(" ");
//          oceny[0] = 3;
//          oceny[1] = 2;
//          oceny[2] = 1;
//          oceny[3] = 5;
//          oceny[4] = 3;
//          double srednia = 0;
//          int nieZera = 0;
//          for(int i = 0; i < oceny.length; i++) {
//              System.out.printf(oceny[i] + ", ");
//              srednia += oceny[i];
//              if(oceny[i] != 0){
//                  nieZera++;
//              }
//          }

//          System.out.println("\nSrednia ocen wynosi: " + srednia/nieZera);
//        TODO 2)
//        utwórz tablicę ocen z 5 przedmiotów
//        wpisz przykładowe dane
//        oblicz średnie ocen z każdego przedmiotu
//        oblicz średnią ocen ze wszystkich przedmiotów
//          int[][] subjectGrades = new int[5][];
//          subjectGrades[0] = new int[] {1, 3, 3, 1};
//          subjectGrades[1] = new int[] {4, 3};
//          subjectGrades[2] = new int[] {2, 2, 1};
//          subjectGrades[3] = new int[] {5, 5, 3, 5};
//          subjectGrades[4] = new int[] {1};
//          double averqageOneSub = 0;
//          double averageAllSub = 0;
//          int amountOneGrades = 0;
//          int amountAllGrades = 0;
//          for(int i = 0; i < subjectGrades.length; i++){
//
//              for(int j = 0; j < subjectGrades[i].length; j++){
//
//                  averqageOneSub += subjectGrades[i][j];
//                  averageAllSub += averqageOneSub;
//                  amountOneGrades++;
//
//              }
//              System.out.printf("\nSrednia ocen z %d przedmiotu wynosi: %.2f\n",
//                      i, averqageOneSub/amountOneGrades);
//              amountAllGrades++;
//          }
//
//          System.out.printf("\n Srednia ocen z wszystkich przedmiotów wynosi %.2f\n",
//                averageAllSub/amountAllGrades);
//        amountOneGrades = 0;
//        amountAllGrades = 0;



//        TODO 3)
//        utwórz tablicę przynajmniej 6 nazwisk i miejscowości kolegów z twojej grupy
//        wydrukuj informację Uczeń ... pochodzi z ..."
//        spośród wszystkich elementów wydrukuj tylko te, które pochodzą z Tarnobrzega
//          String[][] students = {
//                  {"Rider", "chmielow"},
//                  {"Bąk", "żupawa"},
//                  {"Bernyś", "Tarnobrzeg"},
//                  {"ktos", "Tarnobrzeg"}
//          };
//          for(String[] student : students){
//              if(student[1].equals("Tarnobrzeg")){
//                  System.out.println(student[0] + " pochodzi z " + student[1]);
//              }
//          }

//        TODO 4) biorąc pod uwagę dowolną tablicę int, wypisz ile razy w niej występuje liczba 7?
//            int[] tablica = {2, 4, 5, 1, 6, 4, 4, 7, 6};
//            int liczby = 0;
//            for(int liczba : tablica){
//                if(liczba == 4){
//                    liczby++;
//                }
//            }
//        System.out.println(liczby);

//        TODO 5) wypisz true, gdy w tablicy pojawi się sekwencja kolejnych liczb 1, 2, 3
//            int[] arr = {1, 2, 3, 5, 6, 1, 2, 3};
//            for(int i = 0; i < arr.length; i++){
//                if(arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3){
//                    System.out.println(true);
//                }
//            }


//        TODO 6) wypisz true gdy tablica nie zawiera żadnych trójek identycznych liczb po kolei
//            int[] li = {1, 3, 1, 4, 3, 3, 3, 4};
//            boolean bool = true;
//            for(int i = 0; i<li.length - 2; i++){
//                if(li[i] == li[i + 1] && li[i] == li[i+2]){
//                    bool = false;
//                }
//
//            }
//        System.out.println(bool);
//        TODO 7) wypisz true, gdy jeden z pierwszych 4 elementów tablicy wynosi 5 (tablica może mieć mniejszy rozmiar)
//            int[] tab = {2, 5, 1, 4, 5, 1, 5};
//            boolean bool = false;
//            for(int i = 0; i < 4; i++){
//                    if(tab[i] == 5){
//                        bool = true;
//                    }
//
//                }
//        System.out.println(bool);
//        TODO 8) biorąc pod uwagę tablicę policz ile razy wystapi w niej sekwencja cyfry 6 i kolejnej 6 bądź 7
//            int[] tab = {2, 6, 6, 1, 5, 6, 6, 4, 6, 3};
//            int a = 0;
//            for(int i = 0; i < tab.length - 1; i++){
//                if(tab[i] == 6 && tab[i+1] == 6 || tab[i+1] == 7){
//                   a++;
//                }
//            }
//        System.out.println(a);
            //TODO 9) 2 tablice jednowymiarowe różnej długości. wypisz true gdy pierwsze elementy tablicy lub ostatnie są równe

//        int[] a = {3, 4, 1};
//        int[] b = {3, 1, 1, 3};
//        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
//            System.out.println(true);}
        //TODO 10) tablica double o dowolnej długości. Odwróć elementy i wypisz na ekranie.
        double[] tab = {1, 2, 3, 4};

    }
}
