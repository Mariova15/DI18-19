using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    class Avituallamiento
    {

        private String carrera;
        private long puntoKilometrico;
        private PersonaContacto personaContacto;
        private List<MaterialDisponible> listaMateriales;

        /// <summary>
        /// 
        /// </summary>
        /// <param name="carrera"></param>
        /// <param name="puntoKilometrico"></param>
        /// <param name="personaContacto"></param>
        /// <param name="listaMateriales"></param>
        public Avituallamiento(string carrera, long puntoKilometrico, PersonaContacto personaContacto, List<MaterialDisponible> listaMateriales)
        {
            this.carrera = carrera;
            this.puntoKilometrico = puntoKilometrico;
            this.personaContacto = personaContacto;
            this.listaMateriales = listaMateriales;
        }
    }
}
