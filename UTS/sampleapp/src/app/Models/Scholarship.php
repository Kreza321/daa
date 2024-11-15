<?php
namespace App\Models;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Scholarship extends Model
{
    use HasFactory;

    protected $fillable = ['name', 'type', 'amount'];

    public function recipients()
    {
        return $this->hasMany(Recipient::class);
    }
}