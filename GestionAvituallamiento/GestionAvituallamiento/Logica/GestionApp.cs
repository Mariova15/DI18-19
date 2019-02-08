using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.Logica
{
    public class GestionApp
    {
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }
        public List<MaterialDisponible> listaMateriales { get; set; }

        public GestionApp() {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
            listaMateriales = new List<MaterialDisponible>();
        }

        public void annadirAvituallamiento(Avituallamiento avituallamiento, PersonaContacto personacontacto)
        {
            avituallamiento.personaContacto = personacontacto;
            avituallamiento.listaMateriales = listaMateriales;
            listaAvituallamientos.Add(avituallamiento);
            avituallamiento.listaMateriales.Clear();

        }

        public void annadirMaterial(MaterialDisponible material) {
            listaMateriales.Add(material);
        }
    }
}
