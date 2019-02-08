﻿using GestionAvituallamiento.Logica;
using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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
    /// Lógica de interacción para Prueba.xaml
    /// </summary>
    public partial class Prueba : Window
    {
        
        GestionApp gestionApp;

        public Prueba(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;

            this.DataContext = gestionApp;

        }


    }
}
