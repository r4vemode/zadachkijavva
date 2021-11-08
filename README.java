# zadachkijavva

# ZadaschkiJAVA
1 задание
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("какая темп. воды?:");
 
int number = sc.nextInt();
 
if (number <= 0) {
	System.out.print("лед");
	}
if (number > 99) {
	System.out.print("вода");
	}
	if (number >= 100) {
		System.out.print("газ");
	}
}
2 задание
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
System.out.println("cколько лет человеку?:");
 
int number = sc.nextInt();
 
if (number > 19) {
	System.out.print("Тинейджер");
}else{
	System.out.print("не Тинейджер");
	}
}
4 задание
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Введите первое число: ");
int a = input.nextInt();
	System.out.println("Введите второе число: ");
int b = input.nextInt();
	System.out.println("Введите третье число: ");
int c = input.nextInt();
if (a > b)
if (a > c)
	System.out.println("максимальное число: " + a);
else {
	if (b > c)
		System.out.println("максимальное число: " + b);
}
	else {
		System.out.println("максимальное число: " + c);
	}
}
 
5 задание 
public String backAround(String str) {
  String last = str.substring(str.length() - 1);
  return last + str + last;
}
6 задание 
boolean doubleX(String str) {
    for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i)=='x')
            if (str.charAt(i+1)=='x') {
                return true;
            } else {
                return false;
            }
    }
    return false;  
}
9 задание
const a = ['a', 'b', 'c']
const b = ['d', 'e']
 
const c = []
 
for (let i = 0; i < Math.max(a.length, b.length); i++) {
    if (a[i] != null) {
        c.push(a[i])
    }
 
    if (b[i] != null) {
        c.push(b[i])
    }
}
 
console.log(c) // ['a', 'd', 'b', 'e', 'c']
10 задание 
int[] a = {5, 13, 21, 37, 43, 55, 62, 78, 84, 93};
       	int temp = a[0];
        a[0] = a[9];
        a[9] = temp;
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
12 задание 
public static void main(String[] args) {
        int[] array = {2, 5, 7, 8, 3, 0};
    }
 
    public static int range(int[] array, int index, int min, int max) {
        if (index == array.length) {
            if (index == 0)
                return 0;
            else
                return max - min;
        } else {
            int value = array[index];
            return range(array, index + 1, Math.min(value, min), Math.max(value, max));
        }
    }
 
    public static int range(int[] array) {
        return range(array, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    } 
 
 
18 задание 
public static void main(String[] args) {
        String ss = "abc11x11x11sdsdf11dsfsdf11";
        String pat = "11";
        int createw;
        int j = 0;
        int counter = 0;
        while ((createw = ss.indexOf(pat, j)) != -1) {
            counter++;
            j = createw + 1;
        }
        System.out.printf("%s - %d", pat, counter);
    }
