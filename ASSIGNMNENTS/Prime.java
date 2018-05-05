class Prime{
public static void main(String args[]){
	int i,p=0,j,count=1;
	System.out.println("2");
	for(i=3;i>0;i++){
		for(j=2;j<=i/2;j++){
			if(i%j==0){
				p=1;
				break;}
		}
		if(p==0){
			System.out.println(i);
			count++;}
		p=0;
		if(count==10)
			break;
}
}
}