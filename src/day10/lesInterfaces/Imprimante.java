package day10.lesInterfaces;

public abstract interface Imprimante {
	
	int AGE_MAX = 50; // public static final
	
	public void imprimer();
	
	public default void info() {
		System.out.println("Photocopieuse en Jet ancre ou Laser");
	}
	
	public static void infoStatic() {
		System.out.println("Photocopieuse en Jet ancre ou Laser "+AGE_MAX);
	}
	
	//private void infoDetails() {} private possible a partir de la version 8
	
	
}
