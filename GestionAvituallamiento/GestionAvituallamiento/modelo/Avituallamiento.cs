using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class Avituallamiento
    {
        public String carrera { get; set; }
        public double puntoKilometrico { get; set; }
        public PersonaContacto personaContacto { get; set; }
        public ObservableCollection<MaterialDisponible> listaMateriales { get; set; }

        public Avituallamiento() {
            listaMateriales = new ObservableCollection<MaterialDisponible>();
        }

        public Avituallamiento(String carrera, double puntoKilometrico,
            PersonaContacto personaContacto)
        {
            this.carrera = carrera;
            this.puntoKilometrico = puntoKilometrico;
            this.personaContacto = personaContacto;
        }

    }
}
