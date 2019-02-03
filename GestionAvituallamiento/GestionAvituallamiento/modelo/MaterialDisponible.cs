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
        //private enum Tipo { bebida, comida, materiaSsanitario};
        private String tipo;
        private double precio;

        public string NombreProducto { get => nombreProducto; set => nombreProducto = value; }
        public double Precio { get => precio; set => precio = value; }
        public string Tipo { get => tipo; set => tipo = value; }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="nombreProducto"></param>
        /// <param name="precio"></param>
        public MaterialDisponible(string nombreProducto, double precio, String tipo)
        {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.tipo = tipo;
        }

    }
}
