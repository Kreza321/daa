<?php

namespace Database\Seeders;

use App\Models\Scholarship;
use Illuminate\Database\Seeder;

class ScholarshipSeeder extends Seeder
{
    public function run()
    {
        Scholarship::create([
            'name' => 'Beasiswa Prestasi',
            'type' => 'prestasi',
            'amount' => 10000000,
        ]);

        Scholarship::create([
            'name' => 'Beasiswa Kebutuhan',
            'type' => 'kebutuhan',
            'amount' => 5000000,
        ]);
    }
}

