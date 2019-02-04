using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    class Avituallamiento
    {
        private String carrera { get; set; }
        private long puntoKilometrico { get; set; }
        private PersonaContacto personaContacto { get; set; }
        private List<MaterialDisponible> listaMateriales { get; set; }

        public Avituallamiento(string carrera, long puntoKilometrico, PersonaContacto personaContacto, List<MaterialDisponible> listaMateriales)
        {
            this.carrera = carrera;
            this.puntoKilometrico = puntoKilometrico;
            this.personaContacto = personaContacto;
            this.listaMateriales = listaMateriales;
        }

    }
}
