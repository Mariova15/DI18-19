using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionAvituallamiento.logica
{
    public class GestionApp
    {
        public ObservableCollection<Avituallamiento> listaAvituallamientos { get; set; }
        public ObservableCollection<MaterialDisponible> listaMateriales { get; set; }

        public GestionApp() {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
            listaMateriales = new ObservableCollection<MaterialDisponible>();
        }

        public void annadirAvituallamiento(Avituallamiento avituallamiento, PersonaContacto personacontacto)
        {
            avituallamiento.personaContacto = personacontacto;
            avituallamiento.listaMateriales = listaMateriales;
            listaAvituallamientos.Add(avituallamiento);
            //avituallamiento.listaMateriales.Clear();

        }

        public void annadirMaterial(MaterialDisponible material) {
            listaMateriales.Add(material);            
        }

        public void borrarMateriales() {
            listaMateriales.Clear();
        }
    }
}
