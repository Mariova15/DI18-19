using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class PersonaContacto : INotifyPropertyChanged, ICloneable
    {
        /*public String nombre { get; set; }
        public int numTelf { get; set; }*/
               
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
    }
}
