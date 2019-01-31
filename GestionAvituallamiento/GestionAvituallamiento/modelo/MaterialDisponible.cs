using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    class MaterialDisponible
    {

        private String nombreProducto;
        private enum Tipo { bebida, comida, materiaSsanitario};
        private double precio;

        public string NombreProducto { get => nombreProducto; set => nombreProducto = value; }
        public double Precio { get => precio; set => precio = value; }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="nombreProducto"></param>
        /// <param name="precio"></param>
        public MaterialDisponible(string nombreProducto, double precio)
        {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
        }

    }
}
