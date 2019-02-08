using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class MaterialDisponible
    {
        public String nombreProducto { get; set; }
        public String tipo { get; set; }
        public double precio { get; set; }

        public MaterialDisponible() { }

        public MaterialDisponible(string nombreProducto, double precio, String tipo)
        {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.tipo = tipo;
        }


    }
}
