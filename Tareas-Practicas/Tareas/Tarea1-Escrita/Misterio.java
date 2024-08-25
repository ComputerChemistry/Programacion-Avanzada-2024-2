
class Misterio{

    public static void main(String[] args){

	misterio (2,2);
	misterio (3,1);
	misterio (4,0);
	misterio (5,3);
	misterio (1,2);
	misterio (7,4);


}
	


public static void misterio(int a, int b)
{


{
    if (a == b || b > 2) {
	a++;
	b = b + 3;
}
    else {
	b++;
}
    if (a < b && a % 2 == 1) {
	a++;
	b = a - 2;
}
    else if (b % 2 == 0) {
	a = a - 2;
	b = a + 3;
}
    System.out.println(a + " " + b);


}
}
}

