using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class Avituallamiento
    {
        public String carrera { get; set; }
        public long puntoKilometrico { get; set; }
        public PersonaContacto personaContacto { get; set; }
        public List<MaterialDisponible> listaMateriales { get; set; }

        public Avituallamiento(string carrera, long puntoKilometrico, PersonaContacto personaContacto, List<MaterialDisponible> listaMateriales)
        {
            this.carrera = carrera;
            this.puntoKilometrico = puntoKilometrico;
            this.personaContacto = personaContacto;
            this.listaMateriales = listaMateriales;
        }

    }
}
