﻿using GestionAvituallamiento.modelo;
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

        public GestionApp() {
            listaAvituallamientos = new ObservableCollection<Avituallamiento>();
        }

        public void annadirAvituallamiento(Avituallamiento avituallamiento, PersonaContacto personaContacto)
        {
            avituallamiento.PersonaContacto = personaContacto;
            listaAvituallamientos.Add(avituallamiento);
        }

        public void borrarAvituallamiento(Avituallamiento avituallamiento)
        {
            listaAvituallamientos.Remove(avituallamiento);
        }

    }
}
