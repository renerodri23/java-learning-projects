public class Automovil {


    private String fabricantes;
    private String modelos;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona owner;
    private Rueda[] ruedas;
    private int id;
    private static int ultimoId;
    static Color colorPatente = Color.NARANJO;

    private TipoAutomovil tipo;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    public Automovil(String modelos, String fabricantes) {
        this();
        this.modelos = modelos;
        this.fabricantes = fabricantes;
    }

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricantes, String modelos, Color color) {
        this(fabricantes,modelos);
        this.color = color;
    }

    public Automovil(String fabricantes, String modelos, Color color, Motor motor) {
        this(fabricantes,modelos,color);
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Automovil(String fabricantes, String modelos, Color color, Motor motor, Estanque estanque, Persona owner, Rueda[] ruedas) {
        this(fabricantes,modelos,color,motor);
        this.estanque = estanque;
        this.owner = owner;
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricantes != null && this.modelos != null &&
                this.fabricantes.equals(a.getFabricante()) && this.modelos.equals(a.getModelos()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Id =" + id + '\''+
                "fabricantes='" + fabricantes + '\'' +
                ", modelos='" + modelos + '\'' +
                ", color='" + color + '\'' +
                ", Motor=" + motor +
                ", Estanque =" + estanque +
                '}';
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Automovil(String fabricantes, Estanque estanque, Motor motor, Color color, String modelos) {
       this(fabricantes, modelos, color, motor);
        this.estanque = estanque;
    }

    public void setFabricantes(String fabricantes){
        this.fabricantes = fabricantes;
    }
    public void setModelos(String modelos){
        this.modelos = modelos;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public void setEstanque(Estanque estanque){
        this.estanque = estanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String getFabricante(){
        return this.fabricantes;
    }
    public String getModelos(){
        return this.modelos;
    }
    public Color getColor(){
        return this.color;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public Estanque getEstanque(){
       if(estanque == null){
           this.estanque = new Estanque();
       }
        return this.estanque;
    }


    public String detalle(){
        return "this.id =" + this.getId()+
                "\nthis.fabricantes = " + this.getFabricante()+
                "\nmodelos = " + this.getModelos() +
                "\ncolor = " + this.color.getColor() +
                "\nauto.patenteColor = "+
                "\ncilindrada = " + this.getMotor();

    }

    public String acelerar(int rpm){
        return "El auto "+fabricantes+" acelerando a "+ rpm+" rpm";
    }

    public String frenar(){
        return this.fabricantes+" "+this.modelos+" frenando!";
    }
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(porcentajeBencina*this.getEstanque().getCapacidad());
    }
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/((porcentajeBencina/100f)*estanque.getCapacidad());
    }
}

