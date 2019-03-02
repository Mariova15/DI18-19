using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class Avituallamiento : INotifyPropertyChanged, ICloneable, IDataErrorInfo
    {
        public ObservableCollection<Material> listaMateriales { get; set; }

        private double puntoKilometrico;
        public double PuntoKilometrico
        {
            get
            {
                return puntoKilometrico;
            }
            set
            {
                this.puntoKilometrico = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PuntoKilometrico"));
            }
        }

        private PersonaContacto personaContacto;
        public PersonaContacto PersonaContacto
        {
            get
            {
                return personaContacto;
            }
            set
            {
                this.personaContacto = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("PersonaContacto"));
            }
        }

        public Avituallamiento()
        {
            listaMateriales = new ObservableCollection<Material>();
        }

        public event PropertyChangedEventHandler PropertyChanged;


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

                if (columnName == "PuntoKilometrico")
                {
                    if (puntoKilometrico == 0)
                    {
                        resultado = "Punto kilométrico vacío";
                    }
                }

                return resultado;

            }
        }
    }
}

