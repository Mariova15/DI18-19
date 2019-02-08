﻿using GestionAvituallamiento.Logica;
using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace GestionAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para CrearAvituallamientos.xaml
    /// </summary>
    public partial class CrearAvituallamientos : Window
    {
        GestionApp gestionApp;
        public Avituallamiento avituallamiento { get; set; }
        public PersonaContacto personaContacto { get; set; }

        public CrearAvituallamientos(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            avituallamiento = new Avituallamiento();
            personaContacto = new PersonaContacto();
            this.DataContext = this;
        }

        private void buttonAnnadirMaterial_Click(object sender, RoutedEventArgs e)
        {
            AnnadirMaterial annadirMaterial = new AnnadirMaterial(gestionApp);
            annadirMaterial.ShowDialog();            

        }

        private void ButtonRegistrarAvituallamiento_Click(object sender, RoutedEventArgs e)
        {
            gestionApp.annadirAvituallamiento(avituallamiento, personaContacto);
            avituallamiento = new Avituallamiento();
            personaContacto = new PersonaContacto();
            //this.Close();
            
        }
    }
}