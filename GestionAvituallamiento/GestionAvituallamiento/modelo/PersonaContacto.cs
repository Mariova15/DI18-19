using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.modelo
{
    public class PersonaContacto
    {
        public String nombre { get; set; }
        public int numTelf { get; set; }

        public PersonaContacto(string nombre, int numTelf)
        {
            this.nombre = nombre;
            this.numTelf = numTelf;
        }
    }
}
