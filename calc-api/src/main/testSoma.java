public class TestCalculadora 
{
    
    public TestCalculadora() 
    {

    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
    
    @Before
    public void setUp() 
    {

    }
    
    @After
    public void tearDown() 
    {

    }

    @Test
    public void testSoma() {
        System.out.println("soma");
        double N1 = 0.0;
        double N2 = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.soma(N1, N2);
        assertEquals(expResult, result, 0.0);
        
    }
}