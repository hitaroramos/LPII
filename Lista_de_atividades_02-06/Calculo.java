public class Calculo
{
        private float totalSalario;

        public void calculaSalario(float salarioBase, int horasTrabalhadas)
        {
            this.totalSalario = salarioBase * horasTrabalhadas;
        }
        
        public float getTotalSalario()
        {
            return this.totalSalario;
        }

        
}
