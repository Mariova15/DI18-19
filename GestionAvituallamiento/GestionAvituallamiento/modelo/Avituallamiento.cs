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
    public class Avituallamiento : INotifyPropertyChanged
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

        private double personaContacto;
        public double PersonaContacto
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

        public Avituallamiento() {
            listaMateriales = new ObservableCollection<MaterialDisponible>();
        }

        public event PropertyChangedEventHandler PropertyChanged;

    }
}
