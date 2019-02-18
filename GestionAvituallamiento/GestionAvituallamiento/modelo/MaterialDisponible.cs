using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class MaterialDisponible : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        /*public String nombreProducto { get; set; }
        public String tipo { get; set; }
        public double precio { get; set; }*/

        private String nombreProducto;
        public String NombreProducto
        {
            get
            {
                return nombreProducto;
            }
            set
            {
                this.nombreProducto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("NombreProducto"));
            }
        }

        private String tipo;
        public String Tipo
        {
            get
            {
                return tipo;
            }
            set
            {
                this.tipo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Tipo"));
            }
        }

        private double precio;
        public double Precio
        {
            get
            {
                return precio;
            }
            set
            {
                this.precio = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Precio"));
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public MaterialDisponible() { }




        public object Clone()
        {
            return this.MemberwiseClone();
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";

                if (columnName == "NombreProducto")
                {
                    if (string.IsNullOrEmpty(nombreProducto))
                    {
                        resultado = "Nombre vacío";
                    }
                }
                if (columnName == "Precio")
                {
                    if ((precio == 0) && (precio > 0))
                    {
                        resultado = "el precio tiene que ser mayor que 0";
                    }
                }
                if (columnName == "Tipo")
                {
                    if (string.IsNullOrEmpty(tipo))
                    {
                        resultado = "Tipo vacío";
                    }
                }
                return resultado;
            }
        }


        public string Error
        {
            get { return ""; }
        }
    }
}
