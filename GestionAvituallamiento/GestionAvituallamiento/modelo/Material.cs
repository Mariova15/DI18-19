using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class Material: INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        
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

        private int cantidad;
        public int Cantidad
        {
            get
            {
                return cantidad;
            }
            set
            {
                this.cantidad = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Cantidad"));
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public Material() { }

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
                        resultado = "El precio tiene que ser mayor que 0";
                    }
                }
                if (columnName == "Cantidad")
                {
                    if ((cantidad == 0) && (cantidad > 0))
                    {
                        resultado = "La cantidad tiene que ser mayor que 0";
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

