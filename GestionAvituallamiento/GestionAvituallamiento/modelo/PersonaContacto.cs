using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class PersonaContacto : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
               
        private String nombre;
        public String Nombre
        {
            get
            {
                return nombre;
            }
            set
            {
                this.nombre = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Nombre"));
            }
        }

        private int numTelf;
        public int NumTelf
        {
            get
            {
                return numTelf;
            }
            set
            {
                this.numTelf = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("NumTelf"));
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public PersonaContacto() { }


        public object Clone()
        {
            return this.MemberwiseClone();
        }

        public string Error
        {
            get { return ""; }
        }

        public string this[string columnName]
        {
            get
            {
                string resultado = "";

                if (columnName == "Nombre")
                {
                    if (string.IsNullOrEmpty(nombre))
                    {
                        resultado = "Nombre vacío";
                    }
                }
                if (columnName == "NumTelf")
                {
                    if (numTelf == 0)
                    {
                        resultado = "Número de telf vacío";
                    }
                }

                return resultado;
            }
        }
    }
}




