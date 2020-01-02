#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define size 200
#define TRUE 1
#define FALSE 0

struct staff{
	

	char isim[30];
	char soyad[30];
    long int tc_kimlik;
    int  zam;
    
	
	
};

struct customer{
	
	char isim[30];
	char soyad[30];
   long int tc_kimlik;
    int  program;
   char membershipType[15];
   
	
	
	
	
};

double indeks();
void showmenu4();
void showmenu3();
void showmenu2();
void showmenu1();
bool want();
bool want1();
void createProgram();
void showProgram();
void add();
void add1();





int main(){

	int i,n;


	int pick;


	int p2;



	while(1){
	showmenu1();
	
	/*  	printf( "\t\t\t\tWelcome to gym management system .\n ");
	printf("\t\tFor log in as a manager pick     <1> \n");
    printf("\t\tFor log in as a staff pick       <2>\n");
	printf("\t\tFor log in as a customer pick    <3>\n");
	printf("\t\tFor log out  ......              <0>\n");*/


printf("Enter your choice..\n");

	scanf("%i",&pick);

 switch(pick){
  case 1:
	int p1;

	printf("You log in as manager your abilities are  give to job kick from job and give  them more money");
	while (1){
		showmenu2();
		printf(	"\t Enter your choice : \n");
		scanf("%i",&p1);



		switch(p1){

			case 1:
	
            display();
            break;

            case 2:
	
            delete();
            break;

            case 3:
          
            update();
            break;

            case 4:
    
            add();
            break;
            case 0:
           	printf("Thanks for choosing us good bye ... manager");
                 break;
						}

	}
	 break;
  case 2:




	printf("You log in as staff your abilities are show the members informations update their lessons and  physical informations\n");

	while (1){
		showmenu3();
		 printf( "\t\t\t\tWelcome our greatest staff :) .\n ");
	printf("\t\tFor show the all members pick               <1>\n");
    printf("\t\tFor update  member                          <2>\n");
	printf("\t\tFor want a new salary :((                   <3>\n");
	printf("\t\tFor make registiration new customer         <4>\n");
	printf("\t\tFor log out  ......                         <0>\n");
		printf(	"\t Enter your choice : \n");
		scanf("%i",&p2);

		switch(p2){

			case 1:
	    	
            display1();
            break;

            case 2:
		   
		  update1();
		  
		   
            break;

            case 3:

            want();
            break;
            case 4:
            
            add1();
            break;

            case 0:
           	printf("Thanks for choosing us good bye ... staff");
           	break;
            return 1;
						}

	}
	break;
	case 3:




	printf("You log in as our gym member your abilities are show the only your informations update your informations  and want new program\n");

	while (1){
		showmenu4();

		printf(	"\t Enter your choice : \n");
		scanf("%i",&p2);

		switch(p2){
			case 1:
            display2();
            break;
            case 2:
            update2();
            break;
            case 3:
            want1();
            break;
            case 4:
           printf("s");
           
			break;
            case 0:
            	printf("Thanks for choosing us good bye ... staff");
                return 1;
                
						}

	}
	break;
		case 0:

			printf("Thanks for chossing us...\n");
			printf("Exiting now\n");
			exit(0);

	}
}

}



void showmenu1(){

	printf( "\t\t\t\tWelcome to gym management system .\n ");
	printf("\t\tFor log in as a manager pick     <1> \n");
    printf("\t\tFor log in as a staff pick       <2>\n");
	printf("\t\tFor log in as a customer pick    <3>\n");
	printf("\t\tFor log out  ......              <0>\n");
}


void showmenu2(){
	printf( "\t\t\t\tWelcome our greatest Manager :) .\n ");
	printf("\t\tFor show the all staffs pick          <1> \n");
    printf("\t\tFor kick the some staff pick          <2>\n");
	printf("\t\tFor make a update to salary of them   <3>\n");
	printf("\t\tFor give a jop to someone             <4>\n");
	printf("\t\tFor log out  ......                   <0>\n");


}
void showmenu3(){
    printf( "\t\t\t\tWelcome our greatest staff :) .\n ");
	printf("\t\tFor show the all members pick               <1>\n");
    printf("\t\tFor update  member                          <2>\n");
	printf("\t\tFor want a new salary :((                   <3>\n");
	printf("\t\tFor make registiration new customer         <4>\n");
	printf("\t\tFor log out  ......                         <0>\n");

}


void showmenu4(){

    printf( "\t\t\t\tWelcome our greatest Member :) .\n ");
	printf("\t\tFor show the personal information         <1> \n");
    printf("\t\tFor update the personal information       <2>\n");
	printf("\t\tFor want a new program                    <3>\n");
	printf("\t\tFor  want to calculate body indeks        <4>\n");
	printf("\t\tFor log out  ......                       <0>\n");
}


double indeks(double weight,double height,double  result){
	double a=height/100;
	double b=weight;
	double c=result

	c=b/(100)*a*a
	return c;

}

void add()
{
	struct staff a;
	
	FILE* fp;
	fp=fopen("staff.txt","w");
	
	while(2){
		
	printf(" Durmak icin  yeni girilen kullanici icin  Y basin  \n")	
	printf("Isim    Soyisim  Tc kimlik\n");
	scanf("%s%s%li",a.isim,a.soyad,&a.tc_kimlik);
	if(a.isim=='Y' && a.isim=='y'){
		printf("\n------EKLEME SONA ERDI-----\n");
	
		fclose(fp);
	return;
}
	fwrite(&a,sizeof(struct staff),1,fp);
	printf("\n-----BASARIYLA EKLENDI-----\n");
}
fclose(fp);


}
void add1()
{
struct customer a;

FILE *fpc;

fpc=fopen("customer.txt","w");

while(2){
	printf("NAME \tSURNAME\t TCIDCARD \t MEMBERSHIPTYPE \n ");
	scanf("%s %s %li %s ",a.isim,a.soyad,isim,&a.tc_kimlik,a.membershipType);
	if(a.isim=='Y' && a.isim=='y'){
		printf("\n------adding finished-----\n");
	
		fclose(fpc);
		return;
		}
		fwrite(&a.sizeof(struct customer),1,fpc);
		printf("--------------succesfully added ----------------------\n");
		
	
	
}
fclose(fpc);
}
void display(){
	FILE *fp;
	struct staff a;
	int no ,num;
	
	fp=fopen("staff.txt","r");
	if(fp=NULL)
	{
		printf("We can not connect staff informations for now\n");
		return;
		
	}
	
	printf(" isim \t soy isim \t tc kimlik \t zam istiyor  \n");
	while(!feof(fp)){
	num=fread(&a,sizeof(struct stuff),1,fp);
	if(num!=0 && a.tc_kimlik!=0)
	{
		
	
	printf("%s\t%s\t%li\t%d \n",a.isim,a.soyad,&a.tc_kimlik,&a.zam);
	}
}

fclose(fp);

	
	
}
void display1(){
		FILE *fpc;
	struct customer a;
	int no ,num;
	
	fpc=fopen("customer.txt","r");
	if(fpc=NULL)
	{
		printf("We can not connect customer informations for now\n");
		return;
		
	}
	
	printf(" isim \t soy isim \t tc kimlik \t program istiyor \t membershiptype \n");
	while(!feof(fpc)){
	num=fread(&a,sizeof(struct customer),1,fpc);
	if(num!=0 && a.tc_kimlik!=0)
	{
	a.
	
	printf("%s\t%s\t%li \t%d \t %s  \n",a.isim,a.soyad,&a.tc_kimlik,&a.program,a.membershipType);
	
	}
}

fclose(fpc);

	
}

void delete(){
	
	
	struct staff b;
	struct staff a={"","",0,false};
	
	char isim[30];
	char soyad[30];
	int num,t=0;
	char secim;
	FILE* fp;
	fp=fopen("staff.txt","r");
	if(fp=NULL){
		printf("at now we didnt connect to staff list\n");
		
		return;
	}
	bas:
		printf("Select staff which you want to kick\n");
		scanf("%s %s",isim,soyad);
		while(!feof(fp)){
			num=fread(&b,sizeof(struct staff),1,fp);
			
			if(strcmp(b.isim,isim)==0&&strcmp(b.soyad,soyad)==0){
				t++;
				fseek(fp -sizeof(struct staff),SEEK_CUR);
				fwrite(&a,sizeof(struct staff),1,fp);
				printf("\n----- succesfully deleted------\n");
				fclose(fp);
				return;
				
					
			}
			
		}
		if(t<=0){
	printf("%s %s he/she is not working here try again !!!\n",isim,soyad);
	printf("Do you want try again ( y ) ?\n ");
	scanf(" %c",&secim);
	secim=toupper(secim);
	if(secim=='y')
	goto bas;
	
			}
			fclose(fp);
			
	
}
void delete1(){
	
	
	struct customer b;
	struct customer a={"","",0,"",0};
	
	char isim[30];
	char soyad[30];
	int num,t=0;
	char secim;
	FILE* fpc;
	fp=fopen("customer.txt","r");
	if(fpc=NULL){
		printf("at now we didnt connect to customer list\n");
		
		return;
	}
	bas:
		printf("Select customer which you want to kick\n");
		scanf("%s %s",isim,soyad);
		while(!feof(fpc)){
			num=fread(&b,sizeof(struct customer),1,fpc);
			
			if(strcmp(b.isim,isim)==0&&strcmp(b.soyad,soyad)==0){
				t++;
				fseek(fpc -sizeof(struct customer),SEEK_CUR);
				fwrite(&a,sizeof(struct customer),1,fpc);
				printf("\n----- succesfully deleted------\n");
				fclose(fpc);
				return;
				
					
			}
			
		}
		if(t<=0){
	printf("%s %s he/she is not working here try again !!!\n",isim,soyad);
	printf("Do you want try again ( y ) ?\n ");
	scanf(" %c",&secim);
	secim=toupper(secim);
	if(secim=='y')
	goto bas;
	
			}
			fclose(fpc);
			
}
	


void sirala(){
	struct ogrenci a,temp;
	struct ogrenci dizi1[50];
	
	int num,sayac=0,secim;
	float dizi[50],tmp;
	int i,j;
	
	FILE* fp;
	fp=fopen("baskent.dat","rb");
	
	if(fp==NULL)
	{
		printf("Dosya acilirken problemle karsilasildi...");
		return;
	}
	printf("1-Kucukten Buyuge\n");
	printf("2-Buyukten Kucuge\n");
	printf("Seciminiz: ");
	scanf("%d",&secim);
	switch(secim){
		
		case 1: 
			while(!feof(fp)){
		num=fread(&a,sizeof(struct ogrenci),1,fp);
		if(num!=0 && a.okulno!=0){
		dizi1[sayac]=a;
		dizi[sayac]=a.ortalama;
		sayac++;
	
		}
}

for(j=0;j<sayac-1;j++)	
for(i=0;i<sayac-1;i++)
if(dizi[i]>dizi[i+1])
{
	tmp=dizi[i];
	dizi[i]=dizi[i+1];
	dizi[i+1]=tmp;
	
		temp=dizi1[i];
	dizi1[i]=dizi1[i+1];
	dizi1[i+1]=temp;
	
}

	printf("Okul Numarasi\tIsim\tSoyisim\tOrtalamasi\n");
for(i=0;i<sayac;i++)
printf("%ld\t%s\t%s\t%.2f\n",dizi1[i].okulno,dizi1[i].isim,dizi1[i].soyad,dizi1[i].ortalama);
		break;
		case 2:
		while(!feof(fp)){
		num=fread(&a,sizeof(struct ogrenci),1,fp);
		if(num!=0 && a.okulno!=0){
		dizi1[sayac]=a;
		dizi[sayac]=a.ortalama;
		sayac++;
	
		}
}

for(j=0;j<sayac-1;j++)	
for(i=0;i<sayac-1;i++)
if(dizi[i]<dizi[i+1])
{
	tmp=dizi[i];
	dizi[i]=dizi[i+1];
	dizi[i+1]=tmp;
	
		temp=dizi1[i];
	dizi1[i]=dizi1[i+1];
	dizi1[i+1]=temp;
	
}

	printf("Okul Numarasi\tIsim\tSoyisim\tOrtalamasi\n");
for(i=0;i<sayac;i++)
printf("%ld\t%s\t%s\t%.2f\n",dizi1[i].okulno,dizi1[i].isim,dizi1[i].soyad,dizi1[i].ortalama);	
			
			break;
			
			
	}
	
	
	
	


fclose(fp);

}
void guncelle(){
		struct ogrenci b;
	struct ogrenci a;
	char isim[30],soyad[30];
	int num,t=0;
	char secim;
	FILE* fp;
	fp=fopen("baskent.dat","rb+");
	
	if(fp==NULL)
	{
		printf("Dosya acilirken problemle karsilasildi...");
		return;
	}

	bas:
	printf("Degistirmek istediginiz ogrencinin Ismini ve soyismini giriniz: ");
	scanf("%s%s",isim,soyad);

	while(!feof(fp)){
	num=fread(&b,sizeof(struct ogrenci),1,fp);
	
		if(strcmp(b.isim,isim)==0 && strcmp(b.soyad,soyad)==0){
		printf("Okul numarasi,Isim,Soyisim ve ortalama giriniz: ");
		scanf("%ld%s%s%f",&a.okulno,a.isim,a.soyad,&a.ortalama);
			t++;
			fseek(fp,-sizeof(struct ogrenci),SEEK_CUR);
			fwrite(&a,sizeof(struct ogrenci),1,fp);
			printf("\n-----BASARIYLA GUNCELLENDI-----\n");
			fclose(fp);
			return;
			
	}
	}

	if(t<=0){
	printf("%s %s isimli bir ogrenci bulunamadi!!!\n",isim,soyad);
	printf("Tekrar denemek istermisiniz( E-H ) ? ");
	scanf(" %c",&secim);
	secim=toupper(secim);
	if(secim=='E')
	goto bas;
}
	
	


fclose(fp);
	
	
	
	
	
}




void goruntule(){
	FILE*fp;
	struct ogrenci a;
	int no,num;
	
	
	fp=fopen("baskent.dat","rb");
	if(fp==NULL){
	printf("Dosya acilirken SORUN olustu.");
	return;
}

	printf("Okul Numarasi\tIsim\tSoyisim\tOrtalamasi\n");
while(!feof(fp)){
	num=fread(&a,sizeof(struct ogrenci),1,fp);
	if(num!=0 && a.okulno!=0)
	printf("%ld\t%s\t%s\t%.2f\n",a.okulno,a.isim,a.soyad,a.ortalama);
}

fclose(fp);

}




