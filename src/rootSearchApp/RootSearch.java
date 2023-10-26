/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rootSearchApp;

/**
 * 
 * @author Bianca Emily Lourenço
 * @author Victor Ramos
 */
public final class RootSearch { 
    
    /**
     * 
     * @param x valor 'x' em f(x) = x³ - 7x² + 14x - 6
     * @return Resultado de f(x)
     */
    private static double functionResult (double x){
        return (Math.pow(x, 3) - (7 * Math.pow(x, 2)) + (14 * x) - 6);
    }
    
    /**
     * 
     * @param x valor de 'x' em f(x) = x³ - 7x² + 14x - 6
     * @return Resultado de f'(x)
     */
    private static double derivativeFunctionResult(double x){
        return ((3 * Math.pow(x, 2)) - (14*x) + 14);
    }
    
    /**
     * 
     * @param x1 Ultimo valor encontrado
     * @param x2 Penultimo valor encontrado
     * @param precision Precisão buscada
     * @return Retorna se o erro relativo está dentro ou fora da precisão buscada
     */
    private static boolean isPrecise(double x1, double x2, double precision){
        return (Math.abs(x1-x2)/Math.abs(x1) < Math.pow(10, -precision));
    }
    
    /**
     * 
     * @param x1 Valor de 'x' que se encontra antes da raiz
     * @param x2 Valor de 'x' que se encontra depois da raiz
     * @param precision Precisão requerida pelo usuário para a aproximação
     * @return Array contendo [raizAproximada, númeroDeIterações] utilizando o Método da Bissecção
     */
    private static double[] bisectionMethod (double x1, double x2, int precision){
        
        int numberOfIterations=0;
        while(true){
            
            double nextX = (x1+x2)/2;
            numberOfIterations++;
            
            if(functionResult(x1)*functionResult(nextX) < 0){
                
                x2 = nextX;
                if( isPrecise(nextX, x1, precision) ){
                    return new double[]{nextX, numberOfIterations};
                }
                
            } else {
                
                x1 = nextX;
                if( isPrecise(nextX, x2, precision) ){
                    return new double[]{nextX, numberOfIterations};
                }
                
            }
        }
    }
    
    /**
     * 
     * @param x Valor de 'x' inicial
     * @param precision Precisão requerida pelo usuário para a aproximação
     * @return Array contendo [raizAproximada, númeroDeIterações] utilizando o Método de Newton
     */
    private static double[] newtonMethod (double x, int precision){
        
        int numberOfIterations=0;
        while(true){
            
            double nextX = x - (functionResult(x)/derivativeFunctionResult(x));
            numberOfIterations++;
            
            if( isPrecise(nextX, x, precision) ){
                return new double[]{nextX, numberOfIterations};
            }
            
            x = nextX;
            
        }
        
    }
    
    /**
     * 
     * @param x1 Valor de 'x' que se encontra antes da raiz
     * @param x2 Valor de 'x' que se encontra depois da raiz
     * @param precision Precisão requerida pelo usuário para a aproximação
     * @return Resultado obtido pelo Método da Bissecção
     */
    public static double bisectionMethodResult(double x1, double x2, int precision){
        return bisectionMethod(x1, x2, precision)[0];
    }
    
    /**
     * 
     * @param x1 Valor de 'x' que se encontra antes da raiz
     * @param x2 Valor de 'x' que se encontra depois da raiz
     * @param precision Precisão requerida pelo usuário para a aproximação
     * @return Número de iterações utilizadas para chegar no resultado pelo Método da Bissecção.
     */
    public static int bisectionMethodIterationsNumber(double x1, double x2, int precision){
        return (int)bisectionMethod(x1, x2, precision)[1];
    }
    
    /**
     *
     * @param x Valor de 'x' inicial
     * @param precision Precisão requerida pelo usuário para a aproximação
     * @return Resultado obtido pelo Método de Newton
     */
    public static double newtonMethodResult(double x, int precision){
        return newtonMethod(x, precision)[0];
    }
    
    /**
     *
     * @param x Valor de 'x' inicial
     * @param precision Precisão requerida pelo usuário para a aproximação
     * @return Número de iterações utilizadas para chegar no resultado pelo Método de Newton.
     */
    public static int newtonMethodIterationsNumber(double x, int precision){
        return (int)newtonMethod(x, precision)[1];
    }
    
}
