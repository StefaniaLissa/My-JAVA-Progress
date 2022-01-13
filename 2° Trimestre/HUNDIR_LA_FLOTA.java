import java.util.Arrays;

public class HUNDIR_LA_FLOTA {
    public static final char AGUA ='A';
    public static final char AGUA_NO_TOCADO='.';
    public static final char TOCADO='X';
    public static final int TAMANNIO=10;
    public static Scanner sc = new Scanner (System.in);

	public static void main (String[]args){
        int P_USUARIO = 24;
        int P_PC = 24;

        boolean juegoTerminado = false;
        boolean tiroCorrecto = false;

        //Declaracion de Arrays
        char [][] mapaUsuario = new char[TAMANNIO][TAMANNIO];
        char [][] mapaOrdenador = new char[TAMANNIO][TAMANNIO];
        char [][] mapaOrdenadorParaUsuario = new char[TAMANNIO][TAMANNIO];
        int [] disparo = new int[2];

        //Inicializar mapas y registrar barcos
        inicializacionMapa(mapaUsuario);
        inicializacionMapa(mapaOrdenador);
        inicializacionMapa(mapaOrdenadorParaUsuario);
        imprimirMapa("MAPA USUARIO", mapaUsuario);
        imprimirMapa("MAPA ORDENADOR", mapaOrdenador);
        imprimirMapa("MAPA REGISTRO ORDENADOR", mapaOrdenadorParaUsuario);

        registrarBarcos(mapaUsuario);
        registrarBarcos(mapaOrdenador);

        while(!juegoTerminado){
            //Dispara Usuario
            if(P_PC!=0){

            }
                //Dispara PC
        }

        public static void inicializacionMapa(char [][] m){
            for (int f =0; f < m.length; f++){
                for (int c =0; c < m[f].length; c++){
                    m[f][c] = AGUA_NO_TOCADO;
                }
            }
        }

        public static void imprimirMapa(String titulo, char [][] m){
            //Crear vector cabecera de las filas
            char[] letrasCabecera = new char[TAMANNIO];

            for(int i =0; i <TAMANNIO; i++){
                letrasCabecera[i]=(char)('A'+i);
            }

            //Visualizar el Array
            //Primera linea de cabecera
            System.out.print(tituolo+"\n    ");
            for(int i =0; i <TAMANNIO; i++){
                System.out.printf("[%1d] ",i);
            }

            //Imprimir contenido del Array
            for (int f =0; f < m.length; f++){
                System.out.printf("\n[%1S] ",letrasCabecera[i]);
                for (int c =0; c < m[f].length; c++){
                    System.out.printf("  %1S  ",m[i][j]);
                }
            }
        }

        public static void registrarBarcos(char [][] m){
            int[] barcos = {5,5,3,3,3,1,1,1,1,1};
            char[] direccion = {'V','H'};


        }
	}
}