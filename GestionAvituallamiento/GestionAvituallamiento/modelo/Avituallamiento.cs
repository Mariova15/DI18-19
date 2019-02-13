using System;
using System.Collections;
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
        /*public String carrera { get; set; }
        public double puntoKilometrico { get; set; }*/
        /*public PersonaContacto personaContacto { get; set; }*/
        public ObservableCollection<MaterialDisponible> listaMateriales { get; set; }

        private String carrera;
        public String Carrera
        {
            get
            {
                return carrera;
            }
            set
            {
                this.carrera = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Carrera"));
            }
        }


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
            listaMateriales = new ObservableCollection<MaterialDisponible>();
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

                if (columnName == "Carrera")
                {
                    if (string.IsNullOrEmpty(carrera))
                    {
                        resultado = "Nombre vacío";
                    }
                }
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
