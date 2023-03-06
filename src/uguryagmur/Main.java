package uguryagmur;

import java.util.Scanner;

public class Main {
	
static TV tv1;
static boolean onAndOff =false;
static int voice=10;
static int currentCh=0;
	public static void setupTheTvAndCreateTheChannels() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen televizyonunuzun markası giriniz: ");
		String brand = scan.nextLine();
		tv1 = new TV(brand);
		tv1.createChannel();
		onAndOff=true;
		System.out.println("Televizyonunuz başarıyla kuruldu!");
	}
	
	public static void tvOff() {
		if (onAndOff==true) {
			onAndOff=false;
			System.out.println("Televizyon kapatılmıştır!");
		} else {
			System.out.println("Televizyonuz zaten kapalı durumda!");
		}
	}
	public static void tvOn() {
		if(tv1 !=null) {
			System.out.println("Televizyonunuz açıldı. İzlediğiniz kanal hakkında bilgi almak için menüye dönün!");
		}
		else {
			System.out.println("Öncelikle televizyonunuzu kurmalısınız !");
		}
	}
	public static void plusVoice() {
		if (onAndOff==true) {
			if (voice<=20) {
				voice++;
				System.out.println("Ses seviyesi: " + voice);
			}
			else {
				System.out.println("Şuan en yüksek seste!");
			}
		}
		else {
			System.out.println("Sesi arttırmak için televizyonunuzun açık olması gereklidir. Açmak için menüye dönünüz!");
		}
	}
	public static void minusVoice() {
		if (onAndOff==true) {
			if (voice>=0) {
				voice--;
				System.out.println("Ses seviyesi: " + voice);
			}
			else {
				System.out.println("Şuan en düşük seste!");
			}
		}
		else {
			System.out.println("Sesi azaltmak için televizyonunuzun açık olması gereklidir. Açmak için menüye dönünüz!");
		}
	}
	public static void infosChannel() {
		if (onAndOff==true) {
			System.out.println(tv1.chList.get(currentCh).getChannelName());
		}
		else {
			System.out.println("Televizyonunuz şu anda kapalı durumda");
		}
	}
	public static void changeTheChannel() {
		if (onAndOff==true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Hangi kanalı açmak istiyorsunuz?");
			currentCh=scan.nextInt();
			if(currentCh>=0 && currentCh<=3) {
				tv1.chList.get(currentCh).getChannelName();
				System.out.println(tv1.chList.get(currentCh).getChannelName());
			}
			else {
				System.out.println("Mevcut olmayan bir kanal seçmeye çalıştınız. Lütfen 0 ile 3 arasında seçim yapınız");
			}
		}
		else {
			System.out.println("Televizyonunuz şu anda kapalı durumda");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int secim=0;
		
		do {
			System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" +"2-- Televizyonu Aç\n" + "3-- Sesini Artır\n" +
					"4--Sesi Azalt\n" +"5-- Kanal Değiştir\n" +"6-- Kanal Bilgisi Goster\n" +"7-- Televizyonu Kapat\n" +
					"8-- Menüyü Goster\n");
			
			 secim=scan.nextInt();
			 switch (secim) {
			case 1:
				setupTheTvAndCreateTheChannels();
				break;
			case 2:
				tvOn();
				break;
			case 3:
			   plusVoice();
				break;
			case 4:
				minusVoice();
				break;
			case 5:
			changeTheChannel();
				break;
			case 6:
				infosChannel();
				break;
			case 7:
				tvOff();
				break;
			case 8:
				break;

			}
			 
			 
			 
			 
			 
		} while (secim !=0);
		
		
			
		

	}

}
