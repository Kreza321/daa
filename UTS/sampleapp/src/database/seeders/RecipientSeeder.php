<?php

namespace Database\Seeders;

use App\Models\Recipient;
use Illuminate\Database\Seeder;

class RecipientSeeder extends Seeder
{
    public function run()
    {
        Recipient::create([
            'name' => 'John Doe',
            'email' => 'john.doe@example.com',
            'scholarship_id' => 1,
        ]);

        Recipient::create([
            'name' => 'Jane Smith',
            'email' => 'jane.smith@example.com',
            'scholarship_id' => 2,
        ]);
    }
}
