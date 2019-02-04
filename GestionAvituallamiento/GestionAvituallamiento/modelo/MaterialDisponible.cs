using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    class MaterialDisponible
    {
        private String nombreProducto { get; set; }
        private String tipo { get; set; }
        private double precio { get; set; }

        public MaterialDisponible(string nombreProducto, double precio, String tipo)
        {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.tipo = tipo;
        }


    }
}
