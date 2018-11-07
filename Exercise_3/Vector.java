import java.util.Random;

import static java.lang.Math.pow;

public class Vector {

    private int size;
    private int[]vector;
    private static final int INCREASE_COEFFICIENT = 2;

    Vector(){

        this.size = 10;
        this.vector = new int[size];
    }

    Vector( int size ){
        this.size = size;
        this.vector = new int[size];
    }

    public void fillingOfVector(){   //заполнение вектора рандомными значениями
        Random random = new Random();
        for ( int i = 0; i < vector.length; i++ ) {
            vector[i] = random.nextInt(100);
        }
    }

    public void addElement( int insertElement ) { //Добавление нового элемента в вектор
        if ( size >= vector.length )  {
           increaseSizeVector();
        }
        vector[size++] = insertElement;
    }

    private void increaseSizeVector(){ //Увеличение размера вектора в два раза
        int[] vectorBuffer = new int [size];
        int newLength = size*INCREASE_COEFFICIENT;
        for(int i = 0; i < vector.length; i++) {
            vectorBuffer [i] = vector [i];
        }
        vector = new int[newLength];
        for(int i = 0; i < vectorBuffer.length; i++) {
            vector[i] = vectorBuffer [i];
        }

    }

    public int findMaxElement(){  //Поиск максимального значения
        int max = vector[0];
        if ( vector.length == 0 ){
            return -1;
        }
        else {
            for ( int i = 1; i < vector.length; i++ ) {
                if ( vector[i] > max ) {
                    max = vector[i];
                }
            }
            return max;
        }
    }

    public int findMinElement(){  //Поиск минимального значения
        int min = vector[0];
        if ( vector.length == 0 ){
            return -1;
        }
        else {
            for ( int i = 1; i < vector.length; i++ ) {
                if ( vector[i] < min ) {
                    min = vector[i];
                }
            }
            return min;
        }
    }

    public double findAverageArithmeticValue() {  //Среднее арифметическое
        int sum = 0;
        for ( int x: vector ) {
            sum+= x;
        }
        return (double) sum / vector.length;
    }

    public double findAverageGeometricValue(){  //Среднее геометрическое
        int multy = 1;
        double power = 1 / vector.length;
        for ( int x: vector ){
            multy*= x;
        }
        return (double) pow( multy, power );
    }

    public int localMax (){ //поиск локального максимума
        for ( int i = 1; i < vector.length - 1; i++) {
            if ( vector [i] > vector[i-1] && vector[i] > vector [i+1] ) {
                return i;
            }
        }
        return -1;
    }

    public int localMin (){ //поиск локального минимума
        for ( int i = 1; i < vector.length - 1; i++) {
            if ( vector [i] < vector[i-1] && vector[i] < vector [i+1] ) {
                return i;
            }
        }
        return -1;
    }

    public void reverseVector(){    //Реверсирование вектора
        for ( int i = 0, j = vector.length - 1; i < vector.length / 2; i++, j-- ) {
            if ( vector[i] != vector[j] ){
              int buf = vector[i];
              vector[i] =  vector[j];
              vector[j] = buf;
            }
        }
    }

    public boolean isSortAscending(){  //проверка, расположены ли элементы вектора по возрастанию
        for ( int i = 0; i < vector.length - 1;) {
            if ( vector [i] > vector [++i] ) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortDescending(){  //проверка, расположены ли элементы вектора по убыванию
        for ( int i = 0; i < vector.length - 1;) {
            if ( vector [i] < vector [++i] ) {
                return false;
            }
        }
        return true;
    }


    public void sortShell(){   //Сортировка Шелла по возрастанию
        int  step, i, j, tmp;
        for (step = vector.length / 2; step > 0; step /= 2) {
            for (i = step; i < vector.length; i++) {
                tmp = vector[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < vector[j - step]) {
                        int buf = vector[j];
                        vector[j] = vector[j - step];
                        vector[j - step] = buf;
                    }
                    else break;
                }
            }
        }
    }

    public void sortBubble(){ //сортировка пузырьком по убыванию
        for ( int i = 0; i < vector.length - 1; i++ ) {
            for ( int j = i + 1; j < vector.length; j++) {
                if ( vector[i] < vector[j] ){
                    int buf = vector[i];
                    vector[i] =  vector[j];
                    vector[j] =  buf;
                }
            }
        }
    }

    public void quickSort( int start, int end){ //Сортировка Хоара по возрастанию
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int center = ( start + end ) / 2;
        while ( i < j ) {
            while (i < center && ( vector[i] <= vector[center])) {
                i++;
            }
            while (j > center && (vector[center] <= vector[j])) {
                j--;
            }
            if (i < j) {
                int temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
                if (i == center) {
                    center = j;
                } else {
                    if (j == center) {
                        center = i;
                    }
                }
            }
        }
        quickSort(start, center);
        quickSort(center+1, end);
    }

    public void insertSort(){
        for ( int i = 1; i < vector.length; i++ ){
            for (int j = i;( j > 0 && vector[j-1]>vector[j]); j--){
                int tmp = vector[j-1];
                vector[j-1] = vector[j];
                vector[j] = tmp;
            }
        }
    }

    public boolean linearSearch( int search )  { //Линейный поиск
        for ( int x: vector ) {
            if ( x == search ) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch( int search ) { //Бинарный поиск
        quickSort(0, vector.length - 1); //Отсортируем вектор
        boolean answer = false;
            int start = 0, end = vector.length / 2, mid;
            while ( start < end ) {
                mid = ( start + end ) / 2;
                if ( search == vector[mid] ) {
                    answer = true;
                    break;
                } else {
                    if ( search <= vector[mid]) {
                        end = mid;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        return answer;
    }


    public int getSize() { //Получение размера вектора
        return size;
    }


    public void print(){ //вывод значений вектора на экран
        for ( int x: vector ){
            System.out.println( " " + x );
        }
    }


}


